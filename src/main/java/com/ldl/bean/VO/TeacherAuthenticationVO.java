package com.ldl.bean.VO;

import com.ldl.bean.User;

public class TeacherAuthenticationVO {
    private int aid;
    private String realName;
    private int isPass;
    private int isRead;
    private User user;
    private String authenticationDate;

    public TeacherAuthenticationVO() {
    }

    public TeacherAuthenticationVO(int aid, String realName, int isPass, int isRead, User user, String authenticationDate) {
        this.aid = aid;
        this.realName = realName;
        this.isPass = isPass;
        this.isRead = isRead;
        this.user = user;
        this.authenticationDate = authenticationDate;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getIsPass() {
        return isPass;
    }

    public void setIsPass(int isPass) {
        this.isPass = isPass;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthenticationDate() {
        return authenticationDate;
    }

    public void setAuthenticationDate(String authenticationDate) {
        this.authenticationDate = authenticationDate;
    }

}
