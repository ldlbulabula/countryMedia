package com.ldl.service.impl;

import com.ldl.bean.User;
import com.ldl.bean.VO.AllNum;
import com.ldl.bean.VO.UserVo;
import com.ldl.mapper.UserMapper;
import com.ldl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

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
        return userMapper.login(user.getopenid());
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
}
