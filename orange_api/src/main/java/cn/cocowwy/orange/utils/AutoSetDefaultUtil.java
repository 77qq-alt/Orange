package cn.cocowwy.orange.utils;

import cn.cocowwy.orange.entity.Trade;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * 该工具包用于自动设置默认值
 * 部分数据读取自 Nacos 配置中心
 *@author Cocowwy
 *@create 2020-12-12-18:48
 */
public class AutoSetDefaultUtil {
    /**
     *小费
     */
    @NacosValue(value = "${defaultTips:1}")
    public static Integer defaultTips;

    /**
     * 设置空字段的默认值
     * 使其满足存入数据库的条件
     * @return
     */
    public static Trade setTradeDefault(Trade trade) {
        // 初始化订单入库基本默认信息
        // 以下为系统默认
        trade.setTradeId(RandomStrategy.getRandomTradeId());
        trade.setCreateTime(LocalDateTime.now());
        trade.setOrderType("0");
        trade.setChangeTime(LocalDateTime.now());

        // 以下优先用户设置信息
        trade.setTips(null == trade.getTips() ? defaultTips : trade.getTips());



        return trade;
    }

}
