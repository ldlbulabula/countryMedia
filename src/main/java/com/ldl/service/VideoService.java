package com.ldl.service;

import com.ldl.bean.VO.VideoVo;
import com.ldl.bean.Video;


public interface VideoService {

    Integer uploadVideo(Video video);

    VideoVo getVideoByVid(String vid);

    int getConcern(String uid,String buid);

    int addConcern(String uid,String buid);

    int removerConcern(String uid,String buid);
}
