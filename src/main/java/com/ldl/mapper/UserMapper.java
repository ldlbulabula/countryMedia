package com.ldl.mapper;

import com.ldl.bean.User;

public interface UserMapper {
    User login(String openid);
    Integer register(User user);
}
