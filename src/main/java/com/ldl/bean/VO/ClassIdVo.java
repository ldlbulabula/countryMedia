package com.ldl.bean.VO;

import com.ldl.bean.User;

public class ClassIdVo {
//    时间
//            是否点赞了
//    课程id
//            收藏人数
//    课程的标题
//            课程的封面
    private int classId;
    private String title;
    private String starNum;
    private String cover;
    private String createTime;
     @Override
     public String toString() {
          return "ClassIdVo{" +
                  "classId=" + classId +
                  ", isLike='"  + '\'' +
                  ", title='" + title + '\'' +
                  ", starNum='" + starNum + '\'' +
                  ", cover='" + cover + '\'' +
                  ", createTime='" + createTime + '\'' +
                  '}';
     }

     public int getClassId() {
          return classId;
     }

     public void setClassId(int classId) {
          this.classId = classId;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getStarNum() {
          return starNum;
     }

     public void setStarNum(String starNum) {
          this.starNum = starNum;
     }

     public String getCover() {
          return cover;
     }

     public void setCover(String cover) {
          this.cover = cover;
     }

     public String getCreateTime() {
          return createTime;
     }

     public void setCreateTime(String createTime) {
          this.createTime = createTime;
     }


}
