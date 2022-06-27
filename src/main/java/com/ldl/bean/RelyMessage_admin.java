package com.ldl.bean;

public class RelyMessage_admin {
    private String commentId;
    private String relyId;
    private User relyUser;
    private String relyContent;
    private String myComment;
    private String relyDate;
    private String myNickName;
    private int adminClass_id;

    public RelyMessage_admin() {
    }

    public RelyMessage_admin(String commentId, String relyId, User relyUser, String relyContent, String myComment, String relyDate, String myNickName, int adminClass_id) {
        this.commentId = commentId;
        this.relyId = relyId;
        this.relyUser = relyUser;
        this.relyContent = relyContent;
        this.myComment = myComment;
        this.relyDate = relyDate;
        this.myNickName = myNickName;
        this.adminClass_id = adminClass_id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getRelyId() {
        return relyId;
    }

    public void setRelyId(String relyId) {
        this.relyId = relyId;
    }

    public User getRelyUser() {
        return relyUser;
    }

    public void setRelyUser(User relyUser) {
        this.relyUser = relyUser;
    }

    public String getRelyContent() {
        return relyContent;
    }

    public void setRelyContent(String relyContent) {
        this.relyContent = relyContent;
    }

    public String getMyComment() {
        return myComment;
    }

    public void setMyComment(String myComment) {
        this.myComment = myComment;
    }

    public String getRelyDate() {
        return relyDate;
    }

    public void setRelyDate(String relyDate) {
        this.relyDate = relyDate;
    }

    public String getMyNickName() {
        return myNickName;
    }

    public void setMyNickName(String myNickName) {
        this.myNickName = myNickName;
    }

    public int getAdminClass_id() {
        return adminClass_id;
    }

    public void setAdminClass_id(int adminClass_id) {
        this.adminClass_id = adminClass_id;
    }
}
