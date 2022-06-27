package com.ldl.controller;

import com.ldl.bean.AdminPublic;
import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.AdminClassVO;
import com.ldl.bean.VO.classVo2;
import com.ldl.service.SearchService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @ApiOperation("首页搜索")
    @PostMapping("/indexSearch")
    @ResponseBody
    public List<classVo2> indexSearch(String regex){
        return searchService.indexSearch(regex);
    }

    @ApiOperation("搜索自己收藏的课程")
    @PostMapping("/starSearch")
    @ResponseBody
    public List<classVo2> starSearch(String openid,String regex){
        return searchService.starSearch(openid,regex);
    }

    @ApiOperation("搜索往期普法学习")
    @PostMapping("/AdminClassSearch")
    @ResponseBody
    public List<classVo2> AdminClassSearch(String regex){
        return searchService.AdminClassSearch(regex);
    }

    @ApiOperation("用户管理搜索")
    @PostMapping("/TeacherAuthenticationSearch")
    @ResponseBody
    public List<TeacherAuthentication> TeacherAuthenticationSearch(String regex){
        return searchService.TeacherAuthenticationSearch(regex);
    }

    @ApiOperation("管理员端查看往期普法学习")
    @PostMapping(value = "/selectAdminClass")
    @ResponseBody
    public List<AdminClassVO> AdminClassSearch_admin(String regex){
        return searchService.AdminClassSearch_admin(regex);
    }

    @ApiOperation("搜索系统消息")
    @PostMapping(value = "/searchAdminPublic")
    @ResponseBody
    public List<AdminPublic> searchAdminPublic(String regex){
        return searchService.searchAdminPublic(regex);
    }
}
