package com.ldl.service;

import com.ldl.bean.User;
import com.ldl.bean.VO.AllNum;
import com.ldl.bean.VO.UserVo;

import java.util.List;

public interface UserService {
    User login(User user);
    List<User> getAllUsers();

    List<User> getConcernUserByOpenId(String openId);

    List<User> getToConcernUserByOpenId(String openId);

    //获取收藏数等等
    AllNum getNum(String openId);

    UserVo getUserVoByOpenId(String openId);

    int modifyUser(UserVo userVo);
}
