package com.ldl.bean;

public class Rely {
       private int id;
       private int uid;
       private int cid;
       private String relyDate;
       private String content;

    public Rely() {
    }

    public Rely(int uid, int cid, String relyDate, String content) {
        this.uid = uid;
        this.cid = cid;
        this.relyDate = relyDate;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Rely{" +
                "id=" + id +
                ", uid=" + uid +
                ", cid=" + cid +
                ", relyDate='" + relyDate + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
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
}
