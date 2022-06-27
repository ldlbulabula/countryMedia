package com.ldl.service.impl;


import com.ldl.bean.User;
import com.ldl.bean.VO.AllNum;
import com.ldl.bean.VO.PreviousAdminClass;
import com.ldl.bean.VO.UserVo;
import com.ldl.mapper.UserMapper;
import com.ldl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;
    /**
     * 登录的逻辑：
     *       得到openid后，判断登录成功与否
     *       如果成功，则进行register操作（将user保存到数据库）。并且从数据库中返回该user
     *       如果失败，则不进行register操作（将user保存到数据库）。返回值为null
     * */
    @Override
    public User login(User user) {
        try {
            userMapper.register(user);
        } catch (Exception ignored) {

         }
        return userMapper.login(user.getOpenid());
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public List<User> getConcernUserByOpenId(String openId) {
        return userMapper.selectConcernUserByOpenId(openId);
    }

    @Override
    public List<User> getToConcernUserByOpenId(String openId) {
        return userMapper.selectConcernMeUserByOpenId(openId);
    }

    @Override
    public AllNum getNum(String openId) {
        return userMapper.selectAllNum(openId);
    }

    @Override
    public UserVo getUserVoByOpenId(String openId) {
        return userMapper.selectUserVoByOpenId(openId);
    }

    @Override
    public int modifyUser(String openid,String field,String value) {
        try {
            return userMapper.updateUser(openid,field,value);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int updateFaceImgAndNickName(String openid, String faceImg, String nickName) {
        try {
            return userMapper.updateFaceImgAndNickName(openid,faceImg,nickName);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int completeAdminClass(String openid, int adminClass_id) {
        try {
           return userMapper.completeAdminClass(openid,adminClass_id, simpleDateFormat.format(new Date()));
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public String getCompleteAdminClassCondition(String openid, int adminClass_id) {
        String s = userMapper.getCompleteAdminClassCondition(openid, adminClass_id);
        if(s==null){
            return "NotComplete";
        }else return s;
    }

    @Override
    public List<PreviousAdminClass> getPreviousAdminClass(String openid) {
        return userMapper.getPreviousAdminClass(openid);
    }
}
