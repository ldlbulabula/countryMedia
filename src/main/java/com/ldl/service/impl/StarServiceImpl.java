package com.ldl.service.impl;

import com.ldl.bean.Star;
import com.ldl.mapper.ClassMapper;
import com.ldl.mapper.StarMapper;
import com.ldl.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StarServiceImpl implements StarService {
    @Autowired
    private StarMapper starMapper;

    @Autowired
    private ClassMapper classMapper;

    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat format;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateStar(String openid, String cid) {
        Star star = starMapper.selectStarBy(openid, cid);
        String date = this.format.format(new Date());
        star.setCreateTime(date);
        if (star.getIsStar().equals("1")){
            star.setIsStar("0");
            classMapper.updateClassStar(Integer.parseInt(cid),-1);
        }else {
            star.setIsStar("1");
            classMapper.updateClassStar(Integer.parseInt(cid),1);
        }

        starMapper.updateStar(star);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateLike(String openid, String cid) {
        String like = starMapper.selectLike(openid, cid);
        if (like.equals("1")){
            classMapper.updateClassLike(Integer.parseInt(cid),-1);
            starMapper.updateLike(openid,cid,"0");
        }else {
            starMapper.updateLike(openid,cid,"1");
            classMapper.updateClassLike(Integer.parseInt(cid),1);
        }
    }


}
