package com.ldl.bean;

public class Star {
     String id;
     String isStar;
     String openId;
     String createTime;
     String cid;//课程id

     public Star() {
     }

     public Star(String isStar, String openId, String createTime, String cid) {
          this.isStar = isStar;
          this.openId = openId;
          this.createTime = createTime;
          this.cid = cid;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getIsStar() {
          return isStar;
     }

     public void setIsStar(String isStar) {
          this.isStar = isStar;
     }

     public String getOpenId() {
          return openId;
     }

     public void setOpenId(String openId) {
          this.openId = openId;
     }

     public String getCreateTime() {
          return createTime;
     }

     public void setCreateTime(String createTime) {
          this.createTime = createTime;
     }

     public String getCid() {
          return cid;
     }

     public void setCid(String cid) {
          this.cid = cid;
     }
}
