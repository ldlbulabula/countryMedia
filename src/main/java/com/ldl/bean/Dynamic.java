package com.ldl.bean;


public class Dynamic {
    private int did;
    private String type;
    private String class_id;//通过该class_id得到课程标题
    private String adminClass_id;//通过该adminClass_id得到课程标题
    private User user;
    private String date;
    private String c_title;

    public Dynamic() {
    }

    public Dynamic(int did, String type, String class_id, String adminClass_id, User user, String date, String c_title) {
        this.did = did;
        this.type = type;
        this.class_id = class_id;
        this.adminClass_id = adminClass_id;
        this.user = user;
        this.date = date;
        this.c_title = c_title;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getAdminClass_id() {
        return adminClass_id;
    }

    public void setAdminClass_id(String adminClass_id) {
        this.adminClass_id = adminClass_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getC_title() {
        return c_title;
    }

    public void setC_title(String c_title) {
        this.c_title = c_title;
    }
}
