package com.ldl.mapper;

import com.ldl.bean.Rely;

import com.ldl.bean.VO.RelyVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RelyMapper {

    int insertRely(Rely rely);

    List<RelyVo> selectRelysByCid(@Param("cid") String cid);
    List<RelyVo> selectRelysByCid_admin(@Param("adminClass_id") String adminClass_id);

    int insertRely_admin(Rely rely);
}
