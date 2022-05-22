package com.ldl.bean.VO;


import java.util.List;

public class CommentVo {
    private int cid;
    private int uid;
    private int vid;
    private String commentDate;
    private String content;
    private String faceImg;
    private String nickName;
    private List<RelyVo> relyList;

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "CommentVo{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", vid=" + vid +
                ", commentDate='" + commentDate + '\'' +
                ", content='" + content + '\'' +
                ", faceImg='" + faceImg + '\'' +
                ", nickName='" + nickName + '\'' +
                ", relyList=" + relyList +
                '}';
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public CommentVo() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
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

    public List<RelyVo> getRelyList() {
        return relyList;
    }

    public void setRelyList(List<RelyVo> relyList) {
        this.relyList = relyList;
    }
}
