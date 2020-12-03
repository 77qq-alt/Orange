package cn.cocowwy.orange.service;


import cn.cocowwy.orange.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * 用户基本信息表 (User)表服务实现类
 *
 * @author Cocowwy
 * @since 2020-12-03 14:28:20
 */
public interface UserService extends IService<User> {
    List<User> queryUser(String username, String password);
}