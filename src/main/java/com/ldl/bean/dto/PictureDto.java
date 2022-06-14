package com.ldl.bean.dto;

import java.util.List;

public class PictureDto {
    String isUpdatePicture;
    List<String> pictures;

    public String getIsUpdatePicture() {
        return isUpdatePicture;
    }

    public void setIsUpdatePicture(String isUpdatePicture) {
        this.isUpdatePicture = isUpdatePicture;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }
}
