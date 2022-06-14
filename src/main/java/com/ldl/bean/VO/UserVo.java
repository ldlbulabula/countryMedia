package com.ldl.bean.VO;

import io.swagger.annotations.ApiModelProperty;

public class UserVo {

    @ApiModelProperty("openId")
    private String openId;
    @ApiModelProperty("头像保存路径")
    private String faceImg;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("个人签名")
    private String signature;
    @ApiModelProperty("地区")
    private String address;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("生日")
    private String birth;
    @ApiModelProperty("星座")
    private String constellation;

    public String getFaceImg() {
        return faceImg;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }
}
