package com.ldl.service.impl;
import com.ldl.Util.ObsUtil;
import com.ldl.bean.Class;
import com.ldl.mapper.ClassMapper;
import com.ldl.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;


@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classMapper;

    @Override
    public Class uploadClass(Class clazz) {
        List<String> music =null;
        List<String> picture =null;
        List<String> video =null;
        try {
            classMapper.insertClass(clazz);//让课程获得数据库的主键
            music = clazz.getMusic();
            picture =clazz.getPicture();
            video =clazz.getVideo();
            classMapper.addClass_music(clazz.getClass_id(),music);
            classMapper.addClass_picture(clazz.getClass_id(),picture);
            classMapper.addClass_video(clazz.getClass_id(),video);
            classMapper.addClass_cover(clazz.getClass_id(),clazz.getCover());
        } catch (Exception e) {

        }

        return new Class(clazz.getClass_id(),
                clazz.getC_title(),
                clazz.getC_summary(),
                clazz.getType(),
                music,
                picture,
                video,
                clazz.getCover(),
                clazz.getTeacher());

    }

    @Override
    public String uploadFile(MultipartFile file) {
        return ObsUtil.uploadFile(file);
    }

}
