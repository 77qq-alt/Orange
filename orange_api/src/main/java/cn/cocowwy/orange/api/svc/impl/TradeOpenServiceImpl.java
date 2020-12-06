package cn.cocowwy.orange.api.svc.impl;

import cn.cocowwy.orange.api.dto.ITradeOpenServiceDTO;
import cn.cocowwy.orange.api.svc.ITradeOpenService;
import cn.cocowwy.orange.entity.Trade;
import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.service.TradeService;
import cn.cocowwy.orange.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 *@author Cocowwy
 *@create 2020-12-12-17:35
 */
@Service
public class TradeOpenServiceImpl implements ITradeOpenService {
    @Autowired
    NacosParam nacosParam;

    @Autowired
    AutoSetDefault autoSetDefault;

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    TradeService tradeService;


    @Override
    public ITradeOpenServiceDTO.GetOnlineTradeRespDTO getOnlineTrade(Long userId) {
        // 读取Redis上全部online信息
        //TODO 造假数据 测试接口前端展示效果
        Trade trade1 = Trade.builder()
                .tradeId(RandomStrategy.getRandomTradeId())
                .createUser(1606974511631941L)
                .statusTag("0")
                .title("食堂代买单")
                .content("代买食堂黄焖鸡米饭，谢谢！")
                .tips(2)
                .build();
        Trade trade2 = Trade.builder()
                .tradeId(RandomStrategy.getRandomTradeId())
                .createUser(1606974511631941L)
                .statusTag("0")
                .title("快递代拿")
                .content("求快递戴拿，谢谢，3元大件")
                .tips(3)
                .build();
        Trade trade3 = Trade.builder()
                .tradeId(RandomStrategy.getRandomTradeId())
                .createUser(1606974511631941L)
                .statusTag("0")
                .title("超时代买")
                .content("找一超市代买，薯片，等其他零食，可乐，雪碧，美年达")
                .tips(112)
                .build();
        Trade trade4 = Trade.builder()
                .tradeId(RandomStrategy.getRandomTradeId())
                .createUser(1606974511631941L)
                .statusTag("0")
                .title("超时代买")
                .content("请速度送到")
                .tips(2)
                .build();
        Trade trade5 = Trade.builder()
                .tradeId(RandomStrategy.getRandomTradeId())
                .createUser(1606974511631941L)
                .statusTag("0")
                .title("代打印")
                .content("找一同学带打印")
                .tips(2)
                .build();
        Trade trade6 = Trade.builder()
                .tradeId(RandomStrategy.getRandomTradeId())
                .createUser(1606974511631941L)
                .statusTag("0")
                .title("游戏单")
                .content("找一同学带上分哈哈")
                .tips(nacosParam.getDefaultTips())
                .build();
        ArrayList<Trade> returnList = new ArrayList<>();
        returnList.add(trade1);
        returnList.add(trade2);
        returnList.add(trade3);
        returnList.add(trade4);
        returnList.add(trade5);
        returnList.add(trade6);


        return ITradeOpenServiceDTO.GetOnlineTradeRespDTO.builder().trades(returnList).build();
    }

    /**
     * 订单Online新增规则如下：
     * 使用redis的hash结构保存在线订单
     * key为订单号
     * 每次每笔订单会在redis存一份online版本，数据库存放一份记录版本
     * @param trade
     * @return
     */
    @Override
    public ITradeOpenServiceDTO.AddOnLineTradeRespDTO addOnLineTrade(Trade trade) {
        // 校验新增订单非空
        try {
            AuthCheckUtil.checkAddLogin(trade);
        } catch (Exception e) {
            // 处理异常信息
            return ITradeOpenServiceDTO.AddOnLineTradeRespDTO
                    .builder()
                    .result(false)
                    .message(e.getMessage())
                    .build();
        }

        // 新增默认值
        Trade defaultTrade = autoSetDefault.setTradeDefault(trade);

        // 入redis
        HashOperations opt = redisUtils.getJsonTemplate().opsForHash();
        opt.put("onLineTeade", trade.getTradeId(), trade);

        // 入数据库
        boolean save = tradeService.save(trade);
        if (!save) {
            return ITradeOpenServiceDTO.AddOnLineTradeRespDTO
                    .builder()
                    .result(false)
                    .message("订单入库不成功，请联系管理员！")
                    .build();
        }

        return ITradeOpenServiceDTO.AddOnLineTradeRespDTO
                .builder()
                .result(true)
                .message("派单成功!订单编号为" + trade.getTradeId())
                .build();
    }
}
