package com.ldl.bean.dto;

import java.util.List;

public class MusicDto {
    String isUpdateMusic;
    List<String> musics;

    public String getIsUpdateMusic() {
        return isUpdateMusic;
    }

    public void setIsUpdateMusic(String isUpdateMusic) {
        this.isUpdateMusic = isUpdateMusic;
    }

    public List<String> getMusics() {
        return musics;
    }

    public void setMusics(List<String> musics) {
        this.musics = musics;
    }
}
