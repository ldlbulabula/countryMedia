package com.ldl.bean;

public class FeedBack {
    int  fid;
    String openid;
    String content;
    String create_time;
    String isLook;

    public FeedBack() {
    }

    public FeedBack(String openid, String content, String create_time, String isLook) {
        this.openid = openid;
        this.content = content;
        this.create_time = create_time;
        this.isLook = isLook;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getIsLook() {
        return isLook;
    }

    public void setIsLook(String isLook) {
        this.isLook = isLook;
    }
}
