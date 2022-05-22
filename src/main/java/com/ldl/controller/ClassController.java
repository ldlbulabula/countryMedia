package com.ldl.controller;
import com.ldl.bean.Class;
import com.ldl.bean.User;
import com.ldl.service.ClassService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;


@Controller()
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;
    /**
     * 课程接口
     * @Author ldl
     * @Date 2022/5/20
     */
    @ApiOperation("上传课程,openid不可为空")
    @PostMapping(value = "/uploadClass",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Class uploadClass(String c_title, String c_summary, String type, ArrayList<String> music,ArrayList<String> picture,ArrayList<String> video, String cover, User teacher){
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
                    teacher         //发布人（老师端发布视频）
            )
        );
        System.out.println(clazz);
        return clazz;
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
}
