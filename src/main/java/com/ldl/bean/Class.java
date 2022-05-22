package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.List;

@ApiModel("课程")
public class Class {

    @ApiModelProperty(value = "课程的唯一标识",hidden = true)
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
    @ApiModelProperty("课程上传人——老师")
    private User teacher;

    public Class() {
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

    public Class(Integer class_id, String c_title, String c_summary, String type, List<String> music, List<String> picture, List<String> video, String cover, User teacher) {
        this.class_id = class_id;
        this.c_title = c_title;
        this.c_summary = c_summary;
        this.type = type;
        this.music = music;
        this.picture = picture;
        this.video = video;
        this.cover = cover;
        this.teacher = teacher;
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
