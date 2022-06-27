package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("课程")
public class Class {

    @ApiModelProperty(value = "课程的唯一标识")
    private Integer class_id;
    @ApiModelProperty("课程标题")
    private String c_title;
    @ApiModelProperty("课程简介")
    private String c_summary;
    @ApiModelProperty("课程分类")
    private String type;
    @ApiModelProperty(value = "课程附件音乐")
    private List<String> music;
    @ApiModelProperty(value = "课程附件图片")
    private List<String> picture;
    @ApiModelProperty(value = "课程附件视频")
    private List<String> video;
    @ApiModelProperty("课程封面")
    private String cover;
    @ApiModelProperty("课程ppt")
    private String ppt;
    @ApiModelProperty("课程上传人——老师")
    private User teacher;
    @ApiModelProperty("课程上传时间")
    private String uploadDate;
    @ApiModelProperty("点赞的人数")
    private String likeNum;
    @ApiModelProperty("收藏的人数")
    private String starNum;

    public Class() {
    }

    public Class(Integer class_id, String c_title, String c_summary, String type, List<String> video, String cover, String ppt, String uploadDate) {
        this.class_id = class_id;
        this.c_title = c_title;
        this.c_summary = c_summary;
        this.type = type;
        this.video = video;
        this.cover = cover;
        this.ppt = ppt;
        this.uploadDate = uploadDate;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getC_title() {
        return c_title;
    }

    public void setC_title(String c_title) {
        this.c_title = c_title;
    }

    public String getC_summary() {
        return c_summary;
    }

    public void setC_summary(String c_summary) {
        this.c_summary = c_summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public List<String> getMusic() {
        return music;
    }

    public void setMusic(List<String> music) {
        this.music = music;
    }

    public List<String> getPicture() {
        return picture;
    }

    public void setPicture(List<String> picture) {
        this.picture = picture;
    }

    public List<String> getVideo() {
        return video;
    }

    public void setVideo(List<String> video) {
        this.video = video;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getStarNum() {
        return starNum;
    }

    public void setStarNum(String starNum) {
        this.starNum = starNum;
    }

    public Class(Integer class_id, String c_title, String c_summary, String type, List<String> music, List<String> picture, List<String> video, String cover, User teacher, String uploadDate, String starNum, String likeNum) {
        this.class_id = class_id;
        this.c_title = c_title;
        this.c_summary = c_summary;
        this.type = type;
        this.music = music;
        this.picture = picture;
        this.video = video;
        this.cover = cover;
        this.teacher = teacher;
        this.uploadDate = uploadDate;
        this.likeNum = likeNum;
        this.starNum = starNum;
    }

    @Override
    public String toString() {
        return "Class{" +
                "class_id=" + class_id +
                ", c_title='" + c_title + '\'' +
                ", c_summary='" + c_summary + '\'' +
                ", type='" + type + '\'' +
                ", music=" + music +
                ", picture=" + picture +
                ", video=" + video +
                ", cover='" + cover + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
