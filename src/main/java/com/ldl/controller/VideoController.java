package com.ldl.controller;
import com.ldl.bean.VO.VideoVo;
import com.ldl.bean.Video;
import com.ldl.service.VideoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;



@Controller
public class VideoController {
    @Autowired
    VideoService videoService;
    @Autowired
    SimpleDateFormat simpleDateFormat;


    @ApiOperation("上传视频")
    @ResponseBody
    @PostMapping(value = "/uploadVideo",produces = "application/json;charset=UTF-8")
    public Integer uploadVideo(String title,String video_address,int uid,String summary){
        String uploadDate = simpleDateFormat.format(new Date());
        return videoService.uploadVideo(new Video(title,video_address,uploadDate,uid,summary));
    }

    @ApiOperation("获取视频信息")
    @PostMapping(value = "/video",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public VideoVo getVideo(int vid){
        return videoService.getVideoByVid(vid);
    }

    @ApiOperation("点入相关链接获取关注信息  1是关注，0是未关注")
    @PostMapping("/concern")
    @ResponseBody
    public int getConcern(int uid,int vuid){
        return videoService.getConcern(uid, vuid);
    }

    @ApiOperation("关注人")
    @PutMapping("/addConcern")
    @ResponseBody
    public int addConcern(int uid,int buid) {
        return videoService.addConcern(uid, buid);
    }

    @ApiOperation("取消关注")
    @DeleteMapping("/deleteConcern")
    @ResponseBody
    public int deleteConcern(int uid,int buid) {
        return videoService.removerConcern(uid, buid);
    }
}
