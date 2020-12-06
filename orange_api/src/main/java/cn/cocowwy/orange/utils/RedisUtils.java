package cn.cocowwy.orange.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * 自定义Redis客户端操作工具类
 * 该工具包直允许通过注入的方式获取
 * @author Cocowwy
 * @create 2020-12-12-20:58
 */
@Component
public class RedisUtils {

    @Autowired
    RedisTemplate jsonTemplate;

    /**
     * 分隔符
     */
    public final static String split = ":";


    /**
     * 对外提供该jsonTemplate
     * @return
     */
    public RedisTemplate getJsonTemplate() {
        return jsonTemplate;
    }

    /**
     * redisKey的生成工具
     * @param name
     * @return
     */
    public static String getRedisKey(String... name) {
        StringBuilder sb = new StringBuilder();
        for (String str : name) {
            if (StringUtils.isNotBlank(str)) {
                sb.append(str);
                sb.append(split);
            }
        }
        sb = sb.deleteCharAt(sb.lastIndexOf(split));
        return sb.toString();
    }
}
