package com.ldl.service.impl;

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
}
