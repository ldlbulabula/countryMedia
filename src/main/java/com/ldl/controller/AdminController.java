package com.ldl.controller;

import com.ldl.bean.AdminClass;
import com.ldl.bean.BasicData;
import com.ldl.bean.Dynamic;
import com.ldl.bean.User;
import com.ldl.bean.VO.AdminClassVO;
import com.ldl.bean.VO.FeedBackVO;
import com.ldl.service.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Autowired
    private AdminService adminService;

    @Autowired
    private FeedBackService feedBackService;

    @Autowired
    private BasicDataService basicDataService;

    @Autowired
    private DynamicService dynamicService;



    @ApiOperation("上传管理员课程")
    @PostMapping(value = "/uploadAdminClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public AdminClass  uploadAdminClass(String a_title, String a_summary,String ppt, String video, String cover,String openid){
        return adminClassService.uploadAdminClass(new AdminClass(
                null,a_title,a_summary,ppt,video,cover,"普法",simpleDateFormat.format(new Date()),openid
        ));
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


    @ApiOperation("查看所有的意见反馈")
    @PostMapping(value = "/selectFeedBack")
    @ResponseBody
    public List<FeedBackVO> selectAllFeedBack(){
       return feedBackService.selectAllFeedBack();
    }

    @ApiOperation("根据fid查看意见反馈")
    @PostMapping(value = "/selectFeedBackByFid")
    @ResponseBody
    public FeedBackVO selectFeedBackByFid(String fid){
        return feedBackService.selectFeedBackByFid(fid);
    }

    @ApiOperation("基础数据")
    @PostMapping(value = "/selectBasicData")
    @ResponseBody
    public BasicData selectBasicData(){
        return basicDataService.getBasicData();
    }

    @ApiOperation("获取动态")
    @PostMapping(value = "/selectDynamic")
    @ResponseBody
    public List<Dynamic> selectDynamic(){
        return dynamicService.getDynamics();
    }

    @ApiOperation("查看管理员课程")
    @PostMapping(value = "/selectAdminClass")
    @ResponseBody
    public List<AdminClassVO> selectAdminClass(){
        return adminClassService.selectAdminClass();
    }

    @ApiOperation("查看完成人员")
    @PostMapping(value = "/selectCompleteUser")
    @ResponseBody
    public List<User> selectCompleteUser(int adminClass_id){
        return adminService.selectCompleteUser(adminClass_id);
    }
    
}
