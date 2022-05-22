package com.ldl.mapper;

import com.ldl.bean.Class;

import java.util.List;

public interface ClassMapper {
    Integer addClass_cover(Integer class_id,String cover);
    Integer addClass_music(Integer class_id, List<String> music);
    Integer addClass_picture(Integer class_id, List<String> picture);
    Integer addClass_video(Integer class_id, List<String> video);
    Integer insertClass(Class clazz);
}
