package cn.cocowwy.orange.utils;

import cn.cocowwy.orange.entity.User;
import cn.hutool.core.lang.Assert;

/**
 * 认证校验类工具包
 *@author Cocowwy
 *@create 2020-12-12-16:52
 */
public class AuthCheckUtil {
    /**
     * 注册业务必填字段校验
     * @param user
     */
    public static void checkRegistered(User user){
        // 校验用户必填字段
        Assert.notBlank(user.getUsername());
        Assert.notBlank(user.getPassword());
        Assert.notBlank(user.getName());
        Assert.notBlank(user.getAddress1());
        Assert.notBlank(user.getSex());
        Assert.notBlank(user.getPhone());
        Assert.notBlank(user.getSchoolNumber());
        Assert.notBlank(user.getUserRealName());
        Assert.notBlank(user.getWxId());
    }
}
