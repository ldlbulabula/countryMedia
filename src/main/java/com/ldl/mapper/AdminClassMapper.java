package com.ldl.mapper;

import com.ldl.bean.AdminClass;
import com.ldl.bean.User;
import com.ldl.bean.VO.AdminClassVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminClassMapper {
    Integer insertAdminClass(AdminClass clazz);
    List<AdminClass> getAllAdminClass();

    AdminClass getLatestAdminClass();

    AdminClass getAdminClassById(@Param("adminClass_id") String id);

    List<AdminClassVO> selectAdminClass();
    int getCompleteNum(@Param("adminClass_id") String adminClass_id);
    int getCommentNum(@Param("adminClass_id") String adminClass_id);


}
