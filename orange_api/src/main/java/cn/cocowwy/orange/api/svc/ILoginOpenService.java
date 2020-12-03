package cn.cocowwy.orange.api.svc;

import cn.cocowwy.orange.api.dto.LoginOpenServiceDTO;
import cn.cocowwy.orange.entity.User;

/**
 * 提供登录相关的开放接口
 *@author Cocowwy
 *@create 2020-12-12-13:37
 */
public interface ILoginOpenService {
    /**
     * 用户登录接口
     * @param username
     * @param password
     * @return
     */
    LoginOpenServiceDTO.UserLoginMesageRespDTO UserLoginMesage(String username, String password);


    /**
     * 用户注册接口
     * @param user
     * @return
     */
    LoginOpenServiceDTO.CanBeRegisteredRespDTO CanBeRegistered(User user);
}
