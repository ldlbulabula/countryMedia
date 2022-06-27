package com.ldl.bean.VO;

public class AdminClassVO {
    private int adminClass_id;
    private String a_title;
    private String uploadDate;
    private String cover;
    private int completeNum;
    private int commentNum;

    public AdminClassVO() {
    }

    public AdminClassVO(int adminClass_id, String a_title, String uploadDate, String cover, int completeNum, int commentNum) {
        this.adminClass_id = adminClass_id;
        this.a_title = a_title;
        this.uploadDate = uploadDate;
        this.cover = cover;
        this.completeNum = completeNum;
        this.commentNum = commentNum;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(int completeNum) {
        this.completeNum = completeNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getAdminClass_id() {
        return adminClass_id;
    }

    public void setAdminClass_id(int adminClass_id) {
        this.adminClass_id = adminClass_id;
    }

    @Override
    public String toString() {
        return "AdminClassVO{" +
                "adminClass_id=" + adminClass_id +
                ", a_title='" + a_title + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", cover='" + cover + '\'' +
                ", completeNum=" + completeNum +
                ", commentNum=" + commentNum +
                '}';
    }
}
