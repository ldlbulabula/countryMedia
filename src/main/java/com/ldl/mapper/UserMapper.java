package com.ldl.mapper;

import com.ldl.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User login(String openid);
    Integer register(User user);
    List<User> getAllUsers();
    User selectUserByUid(@Param("uid")int uid);
}
