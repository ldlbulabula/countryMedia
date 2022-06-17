package com.ldl.service.impl;

import com.ldl.bean.Concern;
import com.ldl.bean.VO.VideoVo;
import com.ldl.bean.Video;

import com.ldl.mapper.VideoMapper;
import com.ldl.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;

    @Override
    public Integer uploadVideo(Video video) {
        return videoMapper.uploadVideo(video);
    }

    @Override
    public VideoVo getVideoByVid(String vid) {
        return videoMapper.selectVideo(vid);
    }

    @Override
    public int getConcern(String uid, String buid) {
        Concern concern = videoMapper.selectConcernBy(uid, buid);
        if (concern == null){
            return 0;
        }else {
            return 1;
        }
    }

    @Override
    public int addConcern(String uid, String buid) {
        Concern concern = videoMapper.selectConcernBy(uid, buid);
        int i = 0;
        if (concern == null){
           i = videoMapper.insertConcern(uid, buid);
        }
        return i;
    }

    @Override
    public int removerConcern(String uid, String buid) {
        return videoMapper.deleteConcern(uid, buid);
    }
}
