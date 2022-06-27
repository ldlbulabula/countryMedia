package com.ldl.mapper;

import com.ldl.bean.TeacherAuthentication;
import com.ldl.bean.VO.TeacherAuthenticationVO;
import com.ldl.bean.VO.classVo2;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface TeacherMapper {
   List<classVo2> getMyAllClass(String openid);

   List<classVo2> getMy2Class(String openId);

   List<classVo2> searchMyClass(@Param("openId") String openId,@Param("regex")  String regex);

    int addAuthentication(TeacherAuthentication teacherAuthentication);

    int checkTeacher(@Param("isPass")int isPass,@Param("aid")int aid);

    TeacherAuthentication getCheckTeacherByAid(int aid);

    List<TeacherAuthenticationVO> getAllCheckTeacher();

    void updateIsRead(int aid);

    TeacherAuthentication checkAuthentication(String aid);
}
