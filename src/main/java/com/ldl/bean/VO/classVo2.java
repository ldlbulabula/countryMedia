package com.ldl.bean.VO;

import com.ldl.bean.User;
import com.ldl.bean.Vedio0;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class classVo2 {
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
    private List<Vedio0> video;
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

    public classVo2() {
    }

    public classVo2(Integer class_id, String c_title, String c_summary, String type, List<String> music, List<String> picture, List<Vedio0> video, String cover, String ppt, User teacher, String uploadDate, String likeNum, String starNum) {
        this.class_id = class_id;
        this.c_title = c_title;
        this.c_summary = c_summary;
        this.type = type;
        this.music = music;
        this.picture = picture;
        this.video = video;
        this.cover = cover;
        this.ppt = ppt;
        this.teacher = teacher;
        this.uploadDate = uploadDate;
        this.likeNum = likeNum;
        this.starNum = starNum;
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

    public List<Vedio0> getVideo() {
        return video;
    }

    public void setVideo(List<Vedio0> video) {
        this.video = video;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
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
}
