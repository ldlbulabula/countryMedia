package com.ldl.service.impl;

import com.ldl.bean.User;
import com.ldl.mapper.UserMapper;
import com.ldl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(User user) {
        try {
            if(  !user.getopenid().contains("errcode")&& !user.getopenid().contains("errmsg")  ){
                userMapper.register(user);
            }
        } catch (Exception e) {
                e.printStackTrace();
         }
        return userMapper.login(user.getopenid());
    }
}
