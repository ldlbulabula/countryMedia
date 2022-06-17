package com.ldl.mapper;

import com.ldl.bean.Class;
import com.ldl.bean.VO.ClassIdVo;
import com.ldl.bean.VO.ClassVo1;
import com.ldl.bean.VO.StarClassVo;
import com.ldl.bean.VO.StudyTimeVo;
import com.ldl.bean.dto.ClassDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {
    Integer addClass_cover(Integer class_id,String cover);
    Integer addClass_music(Integer class_id, List<String> music);
    Integer addClass_picture(Integer class_id, List<String> picture);
    Integer addClass_video(Integer class_id, List<String> video);
    Integer insertClass(Class clazz);
    List<Class> getAllClass();
    List<Class> getLatestClass();

    List<ClassIdVo> selectClassVos();//获取那个推荐的列表id等信息

    List<ClassIdVo> selectClassVosComment(@Param("num") int num);//根据点赞的数量获取 在页面好像只有三条

    ClassVo1 selectClassById(@Param("cid") String cid,@Param("openid")String openid);

    List<StarClassVo> selectStarClass(@Param("openid")String openid);

    int updateClassStar(@Param("cid") int cid,@Param("addNum")int num);

    int updateClassLike(@Param("cid") int cid,@Param("addNum")int num);

    List<StarClassVo> selectHistory(@Param("openid")String openid);

    int deleteClassByCid(@Param("cid")String cid);

    StudyTimeVo selectStudyTimeByOpenId(@Param("openId")String openId,@Param("thisDay")String thisDay);

    int insertStudyTime(@Param("openId")String openId,@Param("this_day")String this_day);

    int insertAllStudyTime(@Param("openId")String openId);

    String selectStudyTime(@Param("openId") String openId,@Param("thisDay") String thisDay);

    String selectAllStudyTime(@Param("openId")String openId);

    int updateStudyTime(@Param("addTime")long addTime,@Param("thisDay")String thisDay,@Param("openId")String openId);

    int updateAllStudyTime(@Param("addTime")long addTime,@Param("openId")String openId);

    int updateClass(ClassDto classDto);

    int updateCoverByCid(@Param("cid")String cid,@Param("cover")String cover);

    int deleteVideo(@Param("cid")int cid);

    int deleteMusic(@Param("cid")int cid);

    int deletePicture(@Param("cid")int cid);

    List<Class> getClassByType(String type);

    List<Class> getConcernClass(String openid);

    List<StarClassVo> getlatestLearning(String openid);
    String getClassCover(Integer class_id);
}
