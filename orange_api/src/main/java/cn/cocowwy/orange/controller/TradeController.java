package cn.cocowwy.orange.controller;

import cn.cocowwy.orange.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Map<String, Object>> getTrades(@RequestParam("userInfo") User user) {
        return null;
    }

    @PostMapping("/getTradesByUserId")
    public List<Map<String, Object>> getTradesByUserId(@RequestParam("userInfo") User user) {
        return null;
    }


}
