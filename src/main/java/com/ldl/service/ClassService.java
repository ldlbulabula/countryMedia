package com.ldl.service;

import com.ldl.bean.Class;
import com.ldl.bean.VO.*;
import com.ldl.bean.WatchingResult;
import com.ldl.bean.dto.ClassDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface ClassService {
    Class uploadClass(Class clazz);

    String uploadFile(MultipartFile fujian);

    List<Class> getAllClass();

    List<Class> getLatestClass();

    ClassVo getClassIdVo();

    ClassVo1 getClassByCid(String cid,String openid);

    List<StarClassVo> getStarClass(String openId);

    List<StarClassVo> getHistoryClass(String openId);

    int deleteClassByCid(String class_id);

    StudyTimeVo getStudyTimeVo(String openId);

    WatchingResult updateStudyTime(String openId, String start, String end);

    int updateClass(ClassDto classDto);

    List<Class> getClassByType(String type);

    List<Class> getConcernClass(String openid);

    List<StarClassVo> getlatestLearning(String openid);
}
