package com.ldl.bean;

import io.swagger.annotations.ApiModelProperty;

public class Comment {
    @ApiModelProperty(value = "评论的唯一标识",hidden = true)
    private Integer cid;
    @ApiModelProperty("评论发表人的id")
    private String openId;
    @ApiModelProperty("在哪个课程下发表的")
    private Integer class_id;
    @ApiModelProperty("评论日期")
    private String commentDate;
    @ApiModelProperty("评论内容")
    private String content;

    public Comment() {
    }


    public Comment(String uid, Integer class_id, String commentDate, String content) {
        this.openId = uid;
        this.class_id = class_id;
        this.commentDate = commentDate;
        this.content = content;
    }



    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
}
