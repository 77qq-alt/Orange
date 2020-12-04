package cn.cocowwy.orange.api.dto;

import cn.cocowwy.orange.entity.Trade;
import lombok.*;

import java.util.List;

/**
 *@author Cocowwy
 *@create 2020-12-12-17:29
 */
public class ITradeOpenServiceDTO {
    /**
     * 查询在线订单接口出参
     */
    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GetOnlineTradeRespDTO {
        private List<Trade> trades;
    }

    /**
     * 添加在线订单接口出参
     */
    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddOnLineTradeRespDTO {
        private Boolean result;
        private String message;

    }
}
