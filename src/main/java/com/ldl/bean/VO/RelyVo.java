package com.ldl.bean.VO;


public class RelyVo {
//    private Integer id;
    private String openid;
    private Integer cid;
    private String relyDate;
    private String content;
    private String faceImg;
    private String nickName;

    public RelyVo() {
    }

//    public Integer getId() {
//        return rid;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }


    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getRelyDate() {
        return relyDate;
    }

    public void setRelyDate(String relyDate) {
        this.relyDate = relyDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}
