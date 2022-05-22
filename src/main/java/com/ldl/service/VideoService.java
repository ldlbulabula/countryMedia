package com.ldl.service;

import com.ldl.bean.VO.VideoVo;
import com.ldl.bean.Video;


public interface VideoService {
    Integer uploadVideo(Video video);

    VideoVo getVideoByVid(int vid);

    int getConcern(int uid,int buid);

    int addConcern(int uid,int buid);

    int removerConcern(int uid,int buid);
}
