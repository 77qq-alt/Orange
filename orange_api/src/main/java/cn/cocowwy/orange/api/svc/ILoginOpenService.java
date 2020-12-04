package cn.cocowwy.orange.api.svc;

import cn.cocowwy.orange.api.dto.ILoginOpenServiceDTO;
import cn.cocowwy.orange.entity.User;

/**
 * 提供登录注册相关的开放接口
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
    ILoginOpenServiceDTO.UserLoginMesageRespDTO UserLoginMesage(String username, String password);


    /**
     * 用户注册接口
     * @param user
     * @return
     */
    ILoginOpenServiceDTO.UserRegistered UserRegistered(User user);

}
