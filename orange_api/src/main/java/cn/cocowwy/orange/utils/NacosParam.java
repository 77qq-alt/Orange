package cn.cocowwy.orange.utils;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


/**
 * 提供对Nacos上配置信息的读取
 * 该类只能通过注入的方式获取！！
 * 不然读取到的值为null
 * 并且取值仅通过setter的方式
 *@author Cocowwy
 *@create 2020-12-12-15:55
 */
@RefreshScope
@Getter
@Component
public class NacosParam {
    /**
     * 小费金额
     */
    @Value("${config.defaultTips:0.5}")
    public Integer defaultTips;

    /**
     * 欢迎标语
     */
    @Value("${config.welcome:0.5}")
    public String welcome;

    /**
     * 默认订单预存货时间
     */
    @Value("${config.tradeAliveHours:2}")
    public Long tradeAliveHours;
}
