package cn.cocowwy.orange.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * 自定义Redis客户端操作工具类
 *@author Cocowwy
 *@create 2020-12-12-20:58
 */
@Component
public final class RedisUtils {
    private static RedisTemplate jsonTemplate = new RedisTemplate();

    /**
     * 对外提供该jsonTemplate
     * @return
     */
    public static RedisTemplate getJsonTemplate() {
        return jsonTemplate;
    }

    /**
     * key为字符串类型
     * value为obj
     * @param key
     * @param obj
     */
    public static void setObj(String key, Object obj) {
        jsonTemplate.opsForValue().set(key, obj);
    }

    /**
     * key为Object类型
     * value为obj
     * @param key
     * @param obj
     */
    public static void set(Object key, Object obj) {
        jsonTemplate.opsForValue().set(key, obj);
    }


}
