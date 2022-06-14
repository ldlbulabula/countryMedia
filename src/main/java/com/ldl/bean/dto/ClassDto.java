package com.ldl.bean.dto;

public class ClassDto {
    private String cid;
    private String c_title;
    private String c_summary;
    private String type;
    private String updateTime;
    private CoverDto coverDto;
    private VideoDto videoDto;
    private PictureDto pictureDto;
    private MusicDto musicDto;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getC_title() {
        return c_title;
    }

    public void setC_title(String c_title) {
        this.c_title = c_title;
    }

    public String getC_summary() {
        return c_summary;
    }

    public void setC_summary(String c_summary) {
        this.c_summary = c_summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CoverDto getCoverDto() {
        return coverDto;
    }

    public void setCoverDto(CoverDto coverDto) {
        this.coverDto = coverDto;
    }

    public VideoDto getVideoDto() {
        return videoDto;
    }

    public void setVideoDto(VideoDto videoDto) {
        this.videoDto = videoDto;
    }

    public PictureDto getPictureDto() {
        return pictureDto;
    }

    public void setPictureDto(PictureDto pictureDto) {
        this.pictureDto = pictureDto;
    }

    public MusicDto getMusicDto() {
        return musicDto;
    }

    public void setMusicDto(MusicDto musicDto) {
        this.musicDto = musicDto;
    }
}
