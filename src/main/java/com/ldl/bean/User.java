package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户")
public class User {
    @ApiModelProperty("唯一标识 openID")
    private String openid;
    @ApiModelProperty("头像保存路径")
    private String faceImg;
    @ApiModelProperty("昵称")
    private String nickName;

    @Override
    public String toString() {
        return "User{" +
                "openid='" + openid + '\'' +
                ", faceImg='" + faceImg + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public User(String openid, String faceImg, String nickName) {
        this.openid = openid;
        this.faceImg = faceImg;
        this.nickName = nickName;
    }

    public User() {
    }

    public String getopenid() {
        return openid;
    }

    public void setopenid(String openid) {
        this.openid = openid;
    }

    public String getfaceImg() {
        return faceImg;
    }

    public void setfaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public String getnickName() {
        return nickName;
    }

    public void setnickName(String nickName) {
        this.nickName = nickName;
    }
}
