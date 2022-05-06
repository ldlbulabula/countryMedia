package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("视频")
public class Video {
    @ApiModelProperty("视频的唯一标识")
    private Integer vid;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("作者")
    private String author_name;
    @ApiModelProperty("作者的openid")
    private String author_openid;
    @ApiModelProperty("云端地址")
    private String video_address;


}
