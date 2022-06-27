package com.ldl.service;

import com.ldl.bean.AdminPublic;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.AdminClassVO;
import com.ldl.bean.VO.classVo2;

import java.util.List;

public interface SearchService {
    List<classVo2> indexSearch(String regex);

    List<classVo2> starSearch(String openid, String regex);

    List<classVo2> AdminClassSearch(String regex);

    List<TeacherAuthentication> TeacherAuthenticationSearch(String regex);

    List<AdminClassVO> AdminClassSearch_admin(String regex);

    List<AdminPublic> searchAdminPublic(String regex);
}
