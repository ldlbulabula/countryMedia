package com.ldl.bean;

public class Rely {
       private Integer id;
       private String openId;
       private Integer cid;
       private String relyDate;
       private String content;

    public Rely() {
    }

    public Rely(String uid, Integer cid, String relyDate, String content) {
        this.openId = uid;
        this.cid = cid;
        this.relyDate = relyDate;
        this.content = content;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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

    @Override
    public String toString() {
        return "Rely{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", cid=" + cid +
                ", relyDate='" + relyDate + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
