package cn.cocowwy.orange.controller;

import cn.cocowwy.orange.api.dto.LoginOpenServiceDTO;
import cn.cocowwy.orange.api.svc.ILoginOpenService;
import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.utils.AuthCheckUtil;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

import java.util.Map;

/**
 *@author Cocowwy
 *@create 2020-12-12-21:30
 */
@RestController
@Slf4j
public class LoginController {
    @Autowired
    ILoginOpenService loginOpenService;

    /**
     * 登录
     *
     * @param username
     * @param password
     */
    @PostMapping("/Login")
    public Map<String, Object> Login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Assert.notBlank(username);
        Assert.notBlank(password);
        LoginOpenServiceDTO.UserLoginMesageRespDTO userLoginMesageRespDTO = loginOpenService.UserLoginMesage(username, password);
        return BeanUtil.beanToMap(userLoginMesageRespDTO);
    }

    /**
     * 注册
     */
    @PostMapping("/registered")
    public String registered(@RequestParam("user") User user) {
        // 校验必填字段
        AuthCheckUtil.checkRegistered(user);

        // 是否注册

        return null;
    }
}
