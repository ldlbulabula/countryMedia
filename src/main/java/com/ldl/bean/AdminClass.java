package com.ldl.bean;

public class AdminClass {
   private Integer adminClass_id;
   private String a_title;
   private String a_summary;
   private String ppt;
   private String video;
   private String cover;
   private String type="普法";
   private String uploadDate;
   private String openid;

    public AdminClass() {
    }

    public AdminClass(Integer adminClass_id, String a_title, String a_summary, String ppt, String video, String cover, String type, String uploadDate, String openid) {
        this.adminClass_id = adminClass_id;
        this.a_title = a_title;
        this.a_summary = a_summary;
        this.ppt = ppt;
        this.video = video;
        this.cover = cover;
        this.type = type;
        this.uploadDate = uploadDate;
        this.openid = openid;
    }

    @Override
    public String toString() {
        return "AdminClass{" +
                "adminClass_id=" + adminClass_id +
                ", a_title='" + a_title + '\'' +
                ", a_summary='" + a_summary + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", cover='" + cover + '\'' +
                ", type='" + type + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                '}';
    }

    public Integer getAdminClass_id() {
        return adminClass_id;
    }

    public void setAdminClass_id(Integer adminClass_id) {
        this.adminClass_id = adminClass_id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getA_summary() {
        return a_summary;
    }

    public void setA_summary(String a_summary) {
        this.a_summary = a_summary;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }
}
