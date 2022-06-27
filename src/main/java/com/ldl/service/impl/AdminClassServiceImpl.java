package com.ldl.service.impl;

import com.ldl.bean.AdminClass;
import com.ldl.bean.User;
import com.ldl.bean.VO.AdminClassVO;
import com.ldl.mapper.AdminClassMapper;
import com.ldl.service.AdminClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminClassServiceImpl implements AdminClassService {
    @Autowired
    AdminClassMapper adminClassMapper;

    @Override
    public AdminClass uploadAdminClass(AdminClass adminClass) {
        //获得数据库那边的主键后再返回给前端
        try {
            adminClassMapper.insertAdminClass(adminClass);
        } catch (Exception e) {
            return null;
        }
        return adminClass;
    }

    @Override
    public List<AdminClass> getAllAdminClass() {
        return adminClassMapper.getAllAdminClass();
    }

    @Override
    public AdminClass getLatestAdminClass() {
        return adminClassMapper.getLatestAdminClass();
    }

    @Override
    public AdminClass getAdminClassById(String id) {
        return adminClassMapper.getAdminClassById(id);
    }

    @Override
    public List<AdminClassVO> selectAdminClass() {
        return adminClassMapper.selectAdminClass();
    }



}
