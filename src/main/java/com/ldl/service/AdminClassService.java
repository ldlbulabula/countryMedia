package com.ldl.service;

import com.ldl.bean.AdminClass;
import com.ldl.bean.User;
import com.ldl.bean.VO.AdminClassVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminClassService {
    AdminClass uploadAdminClass(AdminClass adminClass);
    List<AdminClass> getAllAdminClass();
    AdminClass getLatestAdminClass();

    AdminClass getAdminClassById(String id);
    List<AdminClassVO> selectAdminClass();



}
