package com.ldl.controller;
import com.ldl.bean.AdminClass;
import com.ldl.bean.Class;
import com.ldl.bean.User;
import com.ldl.bean.VO.StudyTimeVo;
import com.ldl.bean.dto.ClassDto;
import com.ldl.service.AdminClassService;
import com.ldl.service.ClassService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller()
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;
    @Autowired
    private SimpleDateFormat simpleDateFormat;
    @Autowired
    private AdminClassService adminClassService;
    /**
     * 课程接口
     * @Author ldl
     * @Date 2022/5/20
     */
    @ApiOperation("上传课程,openid不可为空")
    @PostMapping(value = "/uploadClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Class uploadClass(String openId,String c_title, String c_summary, String type, @RequestParam(value = "music[]",required = false) ArrayList<String> music, @RequestParam(value = "picture[]",required = false) ArrayList<String> picture, @RequestParam(value = "video[]",required = false) ArrayList<String> video, String cover, String openid){

        Class clazz = classService.uploadClass(
             new Class(              //课程
                    null,    //课程id
                    c_title,        //标题
                    c_summary,      //简介
                    type,           //类型
                    music,          //音乐附件
                    picture,        //图片附件
                    video,          //视频附件
                    cover,          //封面
                    new User(null,openid,null,null),//发布人（老师端发布视频）
                    simpleDateFormat.format(new Date()),      //上传时间
                     "0",
                     "0"
            )
        );
        System.out.println(clazz);
        return clazz;
    }
    @ApiOperation("获取全部课程")
    @PostMapping(value = "/getAllClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<Class> getAllClass(){
        return classService.getAllClass();
    }

    @ApiOperation("获取最新的管理员课程")
    @PostMapping(value = "/getLatestAdminClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public AdminClass getLatestAdminClass(){
        return adminClassService.getLatestAdminClass();
    }

    /*
    * 上传课程附件和上传封面相关的接口
    * 内容其实是一模一样的
    * 分开写主要是为了方便前端理清楚逻辑
    * */

    @ApiOperation("上传课程音乐")
    @PostMapping(value = "/uploadMusic")
    @ResponseBody
    public String uploadMusic(MultipartFile music){
        return classService.uploadFile(music);
    }

    @ApiOperation("上传课程图片")
    @PostMapping(value = "/uploadPicture")
    @ResponseBody
    public String uploadPicture(MultipartFile picture){
        return classService.uploadFile(picture);
    }

    @ApiOperation("上传课程视频")
    @PostMapping(value = "/uploadVideo")
    @ResponseBody
    public String uploadVideo(MultipartFile video){
        return classService.uploadFile(video);
    }

    @ApiOperation("上传课程封面")
    @PostMapping(value = "/uploadCover")
    @ResponseBody
    public String uploadCover(MultipartFile cover){
        return classService.uploadFile(cover);
    }


    @ApiOperation("获取课程列表信息")
    @PostMapping("/getClassIds")
    @ResponseBody
    public Object getClassId(){
        return classService.getClassIdVo();
    }


    @ApiOperation("根据课程的id获取课程的具体信息")
    @PostMapping("/getClassByCid")
    @ResponseBody
    public Object getClassByCid(String cid,String openId){
        System.out.println("cid:" + cid);
        System.out.println("openId:" + openId);
        if (openId.equals("undefined")){
            System.out.println("进入了undefined");
            return "openid is undefined";
        }
        return classService.getClassByCid(cid, openId);
    }

    @ApiOperation("获取我收藏的课程")
    @PostMapping("/getStarClass")
    @ResponseBody
    public Object getStarClassByOpenid(String openId){
        return classService.getStarClass(openId);
    }

    @ApiOperation("获取浏览历史的课程")
    @PostMapping("/getHistory")
    @ResponseBody
    public Object getHistory(String openId){
        return classService.getHistoryClass(openId);
    }

    @ApiOperation("根据课程id删除课程")
    @PostMapping("/deleteClass")
    @ResponseBody
    public int deleteClass(String class_id){
        return classService.deleteClassByCid(class_id);
    }

    @ApiOperation("获取学习情况")
    @PostMapping("/getStudyTimeVo")
    @ResponseBody
    public StudyTimeVo getStudyTime(String openId){
        return classService.getStudyTimeVo(openId);
    }

    @ApiOperation("修改学习时间")
    @PostMapping("/updateStudyTime")
    @ResponseBody
    public void modifyStudyTime(String openId,String addTime){
        classService.updateStudyTime(openId,addTime);
    }

    @ApiOperation("编辑课程")
    @PostMapping("/updateClass")
    @ResponseBody
    public int modifyClass(@RequestBody ClassDto classDto){
        return classService.updateClass(classDto);
    }

}
