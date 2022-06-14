package com.ldl.service;

import com.ldl.bean.AdminPublic;

import java.util.List;

public interface AdminService {
    void addPublic(String content,String title);

    List<AdminPublic> getAllAdminPublic();
}
