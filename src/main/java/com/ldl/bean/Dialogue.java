package com.ldl.bean;

public class Dialogue {
    private int did;
    private String content;
    private String createTime;
    private String openid;
    private String to_openid;
    private String to_user_isLook;
    private String type;
    public Dialogue() {
    }

    public Dialogue(String content, String createTime, String openid, String to_openid, String to_user_isLook,String type) {
        this.content = content;
        this.createTime = createTime;
        this.openid = openid;
        this.to_openid = to_openid;
        this.to_user_isLook = to_user_isLook;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getTo_openid() {
        return to_openid;
    }

    public void setTo_openid(String to_openid) {
        this.to_openid = to_openid;
    }

    public String getTo_user_isLook() {
        return to_user_isLook;
    }

    public void setTo_user_isLook(String to_user_isLook) {
        this.to_user_isLook = to_user_isLook;
    }
}
