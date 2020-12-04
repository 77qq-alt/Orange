package cn.cocowwy.orange;


import cn.cocowwy.orange.api.svc.ILoginOpenService;
import cn.cocowwy.orange.service.UserService;
import cn.cocowwy.orange.utils.RandomStrategy;
import cn.cocowwy.orange.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
@Slf4j
class OrangeApplicationTests {
    @Autowired
    UserService userService;
    @Autowired
    ILoginOpenService loginOpenService;
    @Autowired
    RedisTemplate redisTemplate;


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
        RandomStrategy.getRandomUserId();

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
