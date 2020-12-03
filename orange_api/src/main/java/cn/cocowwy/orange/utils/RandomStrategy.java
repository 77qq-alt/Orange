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
     * 自定义长12位的唯一userId生成工具
     * 自定义规则：
     * 根据时间生成唯一userId
     * 截取16位长度作为userId
     * @return
     */
    public static Long getRandomUserId() {
        String s1 = String.valueOf(LocalDateTime.now().getYear()).substring(2, 4);
        String s2 = new StringBuilder(String.valueOf(Timestamp.valueOf(LocalDateTime.now()).getTime())).reverse().substring(0, 10);
        return Long.valueOf(s1 + s2);
    }

}
