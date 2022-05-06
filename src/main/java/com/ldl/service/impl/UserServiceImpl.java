package com.ldl.service.impl;

import com.ldl.bean.User;
import com.ldl.mapper.UserMapper;
import com.ldl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 登录的逻辑：
     *       得到openid后，判断登录成功与否
     *       如果成功，则进行register操作（将user保存到数据库）。并且从数据库中返回该user
     *       如果失败，则不进行register操作（将user保存到数据库）。返回值为null
     * */
    @Override
    public User login(User user) {
        try {
            userMapper.register(user);
        } catch (Exception e) {
            e.printStackTrace();
         }
        return userMapper.login(user.getopenid());
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
