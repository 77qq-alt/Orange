package cn.cocowwy.orange.service.impl;

import cn.cocowwy.orange.entity.User;
import cn.cocowwy.orange.mapper.UserMapper;
import cn.cocowwy.orange.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户基本信息表 (User)表服务实现类
 *
 * @author Cocowwy
 * @since 2020-12-02 13:34:31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User dto) {
        return super.save(dto);
    }

}