package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("视频")
public class Video {
    @ApiModelProperty("视频的唯一标识")
    private Integer vid;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("云端地址")
    private String video_address;
    @ApiModelProperty("上传时间")
    private String uploadDate;
    @ApiModelProperty("上传的用户id")
    private int uid;
    @ApiModelProperty("视频简介")
    private String summary;

    @Override
    public String toString() {
        return "Video{" +
                "vid=" + vid +
                ", title='" + title + '\'' +
                ", video_address='" + video_address + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                '}';
    }

    public Video(String title, String video_address, String uploadDate,int uid,String summary) {
        this.summary = summary;
        this.title = title;
        this.video_address = video_address;
        this.uploadDate = uploadDate;
        this.uid = uid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getVideo_address() {
        return video_address;
    }

    public void setVideo_address(String video_address) {
        this.video_address = video_address;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
