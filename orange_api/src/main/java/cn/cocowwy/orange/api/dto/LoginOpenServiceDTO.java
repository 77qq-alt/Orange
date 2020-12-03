package cn.cocowwy.orange.api.dto;

import cn.cocowwy.orange.entity.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.*;

/**
 *@author Cocowwy
 *@create 2020-12-12-13:42
 */
@Getter
@Setter
@ToString
@Builder
public class LoginOpenServiceDTO {
    /**
     * 用户登录接口出参
     */
    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserLoginMesageRespDTO{
        private Boolean result;
        private User user;
    }

    /**
     * 用户注册接口出参
     */
    @Getter
    @Setter
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CanBeRegisteredRespDTO{
        // 是否可注册
        private Boolean result;

        // 备注信息
        private String message;

    }
}
