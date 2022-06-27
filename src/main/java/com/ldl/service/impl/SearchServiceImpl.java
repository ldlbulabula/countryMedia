package com.ldl.service.impl;

import com.ldl.Util.MyUtil;
import com.ldl.bean.AdminPublic;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.AdminClassVO;
import com.ldl.bean.VO.classVo2;
import com.ldl.mapper.SearchMapper;
import com.ldl.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchMapper searchMapper;

    @Override
    public List<classVo2> indexSearch(String regex) {
        return searchMapper.indexSearch(MyUtil.getRegex(regex));
    }

    @Override
    public List<classVo2> starSearch(String openid, String regex) {
        return searchMapper.starSearch(openid,MyUtil.getRegex(regex));
    }

    @Override
    public List<classVo2> AdminClassSearch(String regex) {
        return searchMapper.AdminClassSearch(MyUtil.getRegex(regex));
    }

    @Override
    public List<TeacherAuthentication> TeacherAuthenticationSearch(String regex) {
        return searchMapper.TeacherAuthenticationSearch(MyUtil.getRegex(regex));
    }

    @Override
    public List<AdminClassVO> AdminClassSearch_admin(String regex) {
        return searchMapper.AdminClassSearch_admin(MyUtil.getRegex(regex));
    }

    @Override
    public List<AdminPublic> searchAdminPublic(String regex) {
        return searchMapper.searchAdminPublic(MyUtil.getRegex(regex));
    }
}
