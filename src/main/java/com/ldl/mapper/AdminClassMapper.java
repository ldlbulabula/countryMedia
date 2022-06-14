package com.ldl.mapper;

import com.ldl.bean.AdminClass;

import java.util.List;


public interface AdminClassMapper {
    Integer insertAdminClass(AdminClass clazz);
    List<AdminClass> getAllAdminClass();

    AdminClass getLatestAdminClass();

}
