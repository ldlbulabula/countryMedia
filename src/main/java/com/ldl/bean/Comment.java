package com.ldl.bean;

public class Comment {
    private int cid;
    private int uid;
    private int vid;
    private String commentDate;
    private String content;

    public Comment() {
    }

    public Comment(int uid, int vid, String commentDate, String content) {
        this.uid = uid;
        this.vid = vid;
        this.commentDate = commentDate;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", vid=" + vid +
                ", commentDate='" + commentDate + '\'' +
                ", content='" + content + '\'' +
                '}';
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
}
