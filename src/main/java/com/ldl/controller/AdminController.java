package com.ldl.controller;

import com.ldl.bean.AdminClass;
import com.ldl.service.AdminClassService;
import com.ldl.service.AdminService;
import com.ldl.service.ClassService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller()
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminClassService adminClassService;

    @Autowired
    private ClassService classService;
    @Autowired
    SimpleDateFormat simpleDateFormat;

    @Autowired
    private AdminService adminService;

    @ApiOperation("上传管理员课程")
    @PostMapping(value = "/uploadAdminClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public AdminClass  uploadAdminClass(String a_title, String a_summary,String ppt, String video, String cover,String openid){
        AdminClass adminClass = adminClassService.uploadAdminClass(new AdminClass(
                null,a_title,a_summary,ppt,video,cover,"普法",simpleDateFormat.format(new Date()),openid
        ));
        System.out.println(adminClass);
        return adminClass;
    }

    @ApiOperation("获取全部管理员课程")
    @PostMapping(value = "/getAllAdminClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<AdminClass> getAllAdminClass(){
        return adminClassService.getAllAdminClass();
    }

    @ApiOperation("上传课程ppt")
    @PostMapping(value = "/uploadAdminClassPicture")
    @ResponseBody
    public String uploadPPT(MultipartFile PPT){
        return classService.uploadFile(PPT);
    }

    @ApiOperation("上传课程视频")
    @PostMapping(value = "/uploadAdminClassVideo")
    @ResponseBody
    public String uploadVideo(MultipartFile video){
        return classService.uploadFile(video);
    }

    @ApiOperation("上传课程封面")
    @PostMapping(value = "/uploadAdminClassCover")
    @ResponseBody
    public String uploadCover(MultipartFile cover){
        return classService.uploadFile(cover);
    }


    @ApiOperation("管理员发布信息")
    @PostMapping(value = "/message")
    @ResponseBody
    public void message(String content,String title){
        adminService.addPublic(content,title);
    }


}
