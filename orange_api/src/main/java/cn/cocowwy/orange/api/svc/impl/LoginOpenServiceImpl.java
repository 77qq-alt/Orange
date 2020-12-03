package cn.cocowwy.orange.api.svc.impl;

import cn.cocowwy.orange.api.dto.LoginOpenServiceDTO;
import cn.cocowwy.orange.api.svc.ILoginOpenService;
import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.service.UserService;
import cn.cocowwy.orange.utils.AuthCheckUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@author Cocowwy
 *@create 2020-12-12-13:46
 */
@Service
@Slf4j
public class LoginOpenServiceImpl implements ILoginOpenService {
    @Autowired
    UserService userService;

    /**
     * 用户登录接口
     * 成功则返回用户基本信息
     * @param username
     * @param password
     * @return
     */
    @Override
    public LoginOpenServiceDTO.UserLoginMesageRespDTO UserLoginMesage(String username, String password) {
        List<User> users = userService.queryUser(username, password);
        if (users.size() > 0) {
            return LoginOpenServiceDTO.UserLoginMesageRespDTO
                    .builder()
                    .user(users.get(0))
                    .result(true)
                    .build();
        }
        return LoginOpenServiceDTO.UserLoginMesageRespDTO
                .builder()
                .result(false)
                .build();
    }

    /**
     * 用户注册业务接口
     * @param user
     * @return
     */
    @Override
    public LoginOpenServiceDTO.UserRegistered UserRegistered(User user) {
        // 校验必填字段
        AuthCheckUtil.checkRegistered(user);

        List<User> users = userService.queryUserName(user.getUsername());

        // 校验是否被注册
        if (users.size() != 0) {
            return LoginOpenServiceDTO.UserRegistered
                    .builder()
                    .result(false)
                    .message("该账号已被注册！")
                    .build();
        }

        //校验其余信息  wx不能二次绑定
        List<User> userByWx = userService.querUserByWx(user.getWxId());
        if (userByWx.size() != 0) {
            return LoginOpenServiceDTO.UserRegistered
                    .builder()
                    .result(false)
                    .message("该微信号已其他账号绑定！")
                    .build();
        }

        boolean save = userService.save(user);

        //记录注册失败日志
        if (save == false) {
            log.info("用户注册信息失败，用户注册提供信息为" + user);
        }

        return LoginOpenServiceDTO.UserRegistered
                .builder()
                .result(save)
                .message(save == true ? "用户注册成功" : "用户注册失败，请联系管管理员！")
                .build();
    }
}
