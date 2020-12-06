package cn.cocowwy.orange.controller;

import cn.cocowwy.orange.api.dto.ITradeOpenServiceDTO;
import cn.cocowwy.orange.api.svc.ITradeOpenService;
import cn.cocowwy.orange.entity.Trade;
import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.utils.RandomStrategy;
import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ITradeOpenService tradeOpenService;

    /**
     * 得到所有在线订单
     * @param userId
     * @return
     */
    @PostMapping("/getTrades")
    public List<Trade> getTrades(@RequestParam("userId") Long userId) {
        ITradeOpenServiceDTO.GetOnlineTradeRespDTO onlineTrade = tradeOpenService.getOnlineTrade(userId);
        return onlineTrade.getTrades();
    }


    @PostMapping("/getTradesByUserId")
    public List<Map<String, Object>> getTradesByUserId(@RequestParam("userInfo") User user) {
        return null;
    }

    /**
     * 添加新的在线订单
     * @param trade
     * @return
     */
    @PostMapping("/addTradeOnLine")
    public Map<String, Object> addTrade(Trade trade) {
        ITradeOpenServiceDTO.AddOnLineTradeRespDTO addOnLineTradeRespDTO = tradeOpenService.addOnLineTrade(trade);
        return BeanUtil.beanToMap(addOnLineTradeRespDTO);
    }
}
