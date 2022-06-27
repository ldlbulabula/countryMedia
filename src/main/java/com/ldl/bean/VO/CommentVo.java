package com.ldl.bean.VO;


import java.util.List;

public class CommentVo {
    private Integer cid;
    private String openid;
    private Integer class_id;
    private String commentDate;
    private String content;
    private String faceImg;
    private String nickName;
    private List<RelyVo> relyList;
    private boolean isOpen=false;


    public CommentVo() {
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
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

    public List<RelyVo> getRelyList() {
        return relyList;
    }

    public void setRelyList(List<RelyVo> relyList) {
        this.relyList = relyList;
    }
}
