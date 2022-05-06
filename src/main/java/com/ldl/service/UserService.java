package com.ldl.service;

import com.ldl.bean.User;

import java.util.List;

public interface UserService {
    User login(User user);
    List<User> getAllUsers();
}
