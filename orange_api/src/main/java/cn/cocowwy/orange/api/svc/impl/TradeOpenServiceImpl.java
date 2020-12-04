package cn.cocowwy.orange.api.svc.impl;

import cn.cocowwy.orange.api.dto.ITradeOpenServiceDTO;
import cn.cocowwy.orange.api.svc.ITradeOpenService;
import cn.cocowwy.orange.entity.Trade;
import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.utils.AuthCheckUtil;
import cn.cocowwy.orange.utils.RedisUtils;
import org.springframework.stereotype.Service;

/**
 *@author Cocowwy
 *@create 2020-12-12-17:35
 */
@Service
public class TradeOpenServiceImpl implements ITradeOpenService {
    @Override
    public ITradeOpenServiceDTO.GetOnlineTradeRespDTO getOnlineTrade(User user) {
        //读取Redis上全部online信息

        return null;
    }

    @Override
    public ITradeOpenServiceDTO.AddOnLineTradeRespDTO addOnLineTrade(Trade trade) {
        //校验新增订单非空
        AuthCheckUtil.checkAddLogin(trade);

        return null;
    }
}
