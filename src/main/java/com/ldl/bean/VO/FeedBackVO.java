package com.ldl.bean.VO;

import com.ldl.bean.User;

public class FeedBackVO {
    private int  fid;
    private String content;
    private String create_time;
    private String isLook;
    private String openid ;
    private User user;
    public FeedBackVO() {
    }

    public FeedBackVO(int fid, String content, String create_time, String isLook, String openid, User user) {
        this.fid = fid;
        this.content = content;
        this.create_time = create_time;
        this.isLook = isLook;
        this.openid = openid;
        this.user = user;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
