package com.ldl.bean.dto;

import java.util.List;

public class VideoDto {
    String isUpdateVideo;
    List<String> videos;

    public String getIsUpdateVideo() {
        return isUpdateVideo;
    }

    public void setIsUpdateVideo(String isUpdateVideo) {
        this.isUpdateVideo = isUpdateVideo;
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }
}
