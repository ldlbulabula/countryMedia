package com.ldl.bean.VO;

public class PreviousAdminClass {
    private int adminClass_id;
    private String uploadDate;
    private String a_title;
    private String isComplete;

    public PreviousAdminClass() {
    }

    public PreviousAdminClass(int adminClass_id, String uploadDate, String a_title, String isComplete) {
        this.adminClass_id = adminClass_id;
        this.uploadDate = uploadDate;
        this.a_title = a_title;
        this.isComplete = isComplete;
    }

    public int getAdminClass_id() {
        return adminClass_id;
    }

    public void setAdminClass_id(int adminClass_id) {
        this.adminClass_id = adminClass_id;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getA_title() {
        return a_title;
    }

    public void setA_title(String a_title) {
        this.a_title = a_title;
    }

    public String getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(String isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return "PreviousAdminClass{" +
                "adminClass_id=" + adminClass_id +
                ", uploadDate='" + uploadDate + '\'' +
                ", a_title='" + a_title + '\'' +
                ", isComplete='" + isComplete + '\'' +
                '}';
    }
}
