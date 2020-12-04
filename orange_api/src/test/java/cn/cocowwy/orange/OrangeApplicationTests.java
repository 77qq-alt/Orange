package cn.cocowwy.orange;


import cn.cocowwy.orange.api.svc.ILoginOpenService;
import cn.cocowwy.orange.service.UserService;
import cn.cocowwy.orange.utils.AutoSetDefaultUtil;
import cn.cocowwy.orange.utils.RandomStrategy;
import cn.cocowwy.orange.utils.RedisUtils;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;

import java.time.LocalDateTime;


@SpringBootTest
@Slf4j
@RefreshScope
class OrangeApplicationTests {
    @Autowired
    UserService userService;
    @Autowired
    ILoginOpenService loginOpenService;
    @Autowired
    RedisTemplate redisTemplate;
    @Value("${defaultTips:haha}")
    public static String defaultTips;

    /**
     * 测试nacos读取配置
     */
    @Test
    void testNacos() {
        System.out.println(defaultTips);
    }

    /**
     * 测试服务
     */
    @Test
    void testService() {
        // 测试esayCode模板生成是否有效
        System.out.println(userService.queryUser("111", "222").size());
        ;
    }

    /**
     * 测试自定义userId生成策略
     * 时间戳+用户名的hashcode值 截取16为长度
     */
    @Test
    void userIdRandomStrategy() {
//        RandomStrategy.getRandomUserId();
        String s1 = String.valueOf(LocalDateTime.now().getYear()).substring(2, 4);

    }

    // 测试svc接口
    @Test
    void svc() {
        System.out.println(loginOpenService.UserLoginMesage("123456", "123456"));
        System.out.println(loginOpenService.UserLoginMesage("111", "111"));
    }

    @Test
    void redis() {
        //使用json序列化
        RedisUtils.set("jsonRedisTemplate", loginOpenService.UserLoginMesage("123456", "123456"));
        //默认
        redisTemplate.opsForValue().set("redisTemplate", loginOpenService.UserLoginMesage("123456", "123456"));
    }
}
