package com.ldl.service.impl;

import com.ldl.bean.AdminPublic;
import com.ldl.mapper.PublicMapper;
import com.ldl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private PublicMapper publicMapper;

    @Autowired
    private SimpleDateFormat simpleDateFormat;

    @Override
    public void addPublic(String content,String title) {
        publicMapper.insertPublic(new AdminPublic(title,simpleDateFormat.format(new Date()),content));
    }

    @Override
    public List<AdminPublic> getAllAdminPublic() {
        return publicMapper.selectAllAdminPublic();
    }
}
