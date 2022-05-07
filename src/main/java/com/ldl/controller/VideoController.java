package com.ldl.controller;


import com.ldl.bean.Video;
import com.ldl.service.VideoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Integer uploadVideo(String title,String author_openid,String video_address){
        String uploadDate = simpleDateFormat.format(new Date());
        return videoService.uploadVideo(new Video(title,author_openid,video_address,uploadDate));
    }
}
