package com.ldl.bean;

public class TeacherAuthentication {
    private Integer aid;
    private String identity_card_1;
    private String identity_card_2;
    private String openid;
    private String realName;
    private String authenticationDate;
    private int isPass;
    private int isRead;

    public TeacherAuthentication() {
    }

    public TeacherAuthentication(Integer aid, String identity_card_1, String identity_card_2, String openid, String realName, String authenticationDate, int isPass, int isRead) {
        this.aid = aid;
        this.identity_card_1 = identity_card_1;
        this.identity_card_2 = identity_card_2;
        this.openid = openid;
        this.realName = realName;
        this.authenticationDate = authenticationDate;
        this.isPass = isPass;
        this.isRead = isRead;
    }

    public String getAuthenticationDate() {
        return authenticationDate;
    }

    public void setAuthenticationDate(String authenticationDate) {
        this.authenticationDate = authenticationDate;
    }

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getIdentity_card_1() {
        return identity_card_1;
    }

    public void setIdentity_card_1(String identity_card_1) {
        this.identity_card_1 = identity_card_1;
    }

    public String getIdentity_card_2() {
        return identity_card_2;
    }

    public void setIdentity_card_2(String identity_card_2) {
        this.identity_card_2 = identity_card_2;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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

}
