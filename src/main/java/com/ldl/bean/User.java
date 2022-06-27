package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户")
public class User {
    @ApiModelProperty(value = "数据库那边的id")
    private Integer id;
    @ApiModelProperty("唯一标识 openID")
    private String openid;
    @ApiModelProperty("头像保存路径")
    private String faceImg;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("注册时间")
    private String registerTime;

    public User(Integer id, String openid, String faceImg, String nickName, String registerTime) {
        this.id = id;
        this.openid = openid;
        this.faceImg = faceImg;
        this.nickName = nickName;
        this.registerTime = registerTime;
    }

    public User(Integer id, String openid, String faceImg, String nickName) {
        this.id = id;
        this.openid = openid;
        this.faceImg = faceImg;
        this.nickName = nickName;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }
}
