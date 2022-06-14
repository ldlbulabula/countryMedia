package com.ldl.mapper;

import com.ldl.bean.AdminPublic;

import java.util.List;


public interface PublicMapper {

    int insertPublic(AdminPublic adminPublic);

    List<AdminPublic> selectAllAdminPublic();
}
