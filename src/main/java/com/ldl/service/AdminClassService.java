package com.ldl.service;

import com.ldl.bean.AdminClass;

import java.util.List;

public interface AdminClassService {
    AdminClass uploadAdminClass(AdminClass adminClass);
    List<AdminClass> getAllAdminClass();
    AdminClass getLatestAdminClass();
}
