package cn.cocowwy.orange.controller.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * 登录返回传输对象
 * LoginRespDTO
 *@author Cocowwy
 *@create 2020-12-12-12:58
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRespDTO {
    /**
     * 登录状态
     */
    private String LoginStatus;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 用户姓名
     */
    private String name;
}
