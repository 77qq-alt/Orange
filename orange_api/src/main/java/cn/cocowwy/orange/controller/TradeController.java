package cn.cocowwy.orange.controller;

import cn.cocowwy.orange.entity.Trade;
import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.utils.RandomStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *@author Cocowwy
 *@create 2020-12-12-17:17
 */
@RestController
@Slf4j
public class TradeController {

    @PostMapping("/getTrades")
    public List<Trade> getTrades(@RequestParam("userId") Long userId) {
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
                .tips(2)
                .build();
        ArrayList<Trade> returnList = new ArrayList<>();
        returnList.add(trade1);
        returnList.add(trade2);
        returnList.add(trade3);

        return returnList;
    }

    @PostMapping("/getTradesByUserId")
    public List<Map<String, Object>> getTradesByUserId(@RequestParam("userInfo") User user) {
        return null;
    }


}
