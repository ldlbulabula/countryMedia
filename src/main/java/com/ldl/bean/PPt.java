package com.ldl.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Date 2022/5/8 11:45
 * @Author hjh
 */
@ApiModel("ppt")
public class PPt {
    @ApiModelProperty("id")
    private int pid;
    @ApiModelProperty("名字")
    private String pptName;
    @ApiModelProperty("文件地址")
    private String pttAddress;
    @ApiModelProperty("用户id")
    private int uid;

    public PPt() {
    }

    @Override
    public String toString() {
        return "PPt{" +
                "pid=" + pid +
                ", pptName='" + pptName + '\'' +
                ", pttAddress='" + pttAddress + '\'' +
                ", uid=" + uid +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPptName() {
        return pptName;
    }

    public void setPptName(String pptName) {
        this.pptName = pptName;
    }

    public String getPttAddress() {
        return pttAddress;
    }

    public void setPttAddress(String pttAddress) {
        this.pttAddress = pttAddress;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
