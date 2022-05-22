package com.ldl.bean.VO;

import com.ldl.bean.PPt;
import com.ldl.bean.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @Date 2022/5/8 11:45
 * @Author hjh
 */
@ApiModel("视频")
public class VideoVo {
    @ApiModelProperty("视频的唯一标识")
    private Integer vid;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("作者的openid")
    private String author_openid;
    @ApiModelProperty("云端地址")
    private String video_address;
    @ApiModelProperty("上传时间")
    private String uploadDate;
    @ApiModelProperty("ppt")
    private PPt ppt;
    @ApiModelProperty("用户信息")
    private User user;

    public VideoVo() {
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_openid() {
        return author_openid;
    }

    public void setAuthor_openid(String author_openid) {
        this.author_openid = author_openid;
    }

    public String getVideo_address() {
        return video_address;
    }

    public void setVideo_address(String video_address) {
        this.video_address = video_address;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public PPt getPpt() {
        return ppt;
    }

    public void setPpt(PPt ppt) {
        this.ppt = ppt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VideoVo{" +
                "vid=" + vid +
                ", title='" + title + '\'' +
                ", author_openid='" + author_openid + '\'' +
                ", video_address='" + video_address + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", ppt=" + ppt +
                ", user=" + user +
                '}';
    }
}
