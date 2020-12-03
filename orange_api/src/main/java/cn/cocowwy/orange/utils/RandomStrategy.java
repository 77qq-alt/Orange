package cn.cocowwy.orange.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * 随机生成工具类
 *@author Cocowwy
 *@create 2020-12-12-13:13
 */
public class RandomStrategy {
    /**
     * 自定义唯一userId生成工具
     * 自定义规则：
     * 时间戳+账户名.hashCode()
     * 截取16位长度作为userId
     * @return
     */
    public static Long getRandomUserId(String username) {
        return Long.valueOf((Timestamp.valueOf(LocalDateTime.now())
                .getTime() + String.valueOf(username.hashCode())).substring(0, 16));
    }

}
