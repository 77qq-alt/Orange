package cn.cocowwy.orange.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * 配置使用Json进行序列化
 *@author Cocowwy
 *@create 2020-12-12-21:20
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<Object, Object> jsonTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Object> ser = new Jackson2JsonRedisSerializer<>(Object.class);
        template.setDefaultSerializer(ser);
        return template;
    }
}
