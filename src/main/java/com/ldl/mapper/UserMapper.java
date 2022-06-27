package com.ldl.mapper;

import com.ldl.bean.User;
import com.ldl.bean.VO.AllNum;
import com.ldl.bean.VO.PreviousAdminClass;
import com.ldl.bean.VO.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User login(String openid);
    Integer register(User user);
    List<User> getAllUsers();
    User selectUserByUid(@Param("uid")int uid);
    User selectUserByOpenId(@Param("openid") String openId);

    List<User> selectConcernUserByOpenId(@Param("openid")String openId);

    List<User> selectConcernMeUserByOpenId(@Param("openid")String openid);

    AllNum selectAllNum(@Param("openId") String openId);

    UserVo selectUserVoByOpenId(@Param("openId")String openId);

    int updateUser(@Param("openid")String openid,@Param("field")String field,@Param("value")String value);

    int updateFaceImgAndNickName(@Param("openid")String openid,@Param("faceImg") String faceImg,@Param("nickName") String nickName);

    int getNewUserCountOfDay(String day);
    int getTotalCountOfUser();

    int completeAdminClass(@Param("openid")String openid,@Param("adminClass_id")int adminClass_id,@Param("completeDate")String completeDate);

    String getCompleteAdminClassCondition(@Param("openid")String openid,@Param("adminClass_id")int adminClass_id);

    List<PreviousAdminClass> getPreviousAdminClass(@Param("openid")String openid);

    void updateRoleAsTeacher(int aid);

    List<User> selectCompleteUser(@Param("adminClass_id") int adminClass_id);
}
