package cn.cocowwy.orange;


import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class OrangeApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void testService() {
        // 测试esayCode模板生成是否有效
        LambdaQueryWrapper<User> lambda = Wrappers
                .<User>lambdaQuery()
                .eq(User::getName, 2);
        userService.getOne(lambda);
    }

}
