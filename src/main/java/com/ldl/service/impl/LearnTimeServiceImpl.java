package com.ldl.service.impl;

import com.ldl.Util.DateUtil;
import com.ldl.bean.LearnTime;
import com.ldl.bean.VO.LearnTimeVO;

import com.ldl.mapper.LearnTimeMapper;
import com.ldl.service.LearnTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LearnTimeServiceImpl implements LearnTimeService {
    @Autowired
    private LearnTimeMapper learnTimeMapper;
    
    @Override
    public void learnThisDay(String openId) {
        //这步小程序可以避免
        String sid = learnTimeMapper.selectIsLearnThisDay(openId, DateUtil.formatToDay(new Date()));
        if (sid != null){
            return;
        }

        LearnTime learnTime = learnTimeMapper.selectLidByOpenId(openId);
        Date date = new Date();
        learnTimeMapper.insertLearn(openId,DateUtil.formatToDay(date));
        //第一天学习
        if (learnTime == null){
            learnTimeMapper.insertLearnUser(openId,1,1);
        }else {
            //非第一次签到

            //判断上一天是否有签到
            String lastDay = DateUtil.formatToDayAndSupOneDay(date,-1);
            String lastDaySid = learnTimeMapper.selectIsLearnThisDay(openId, lastDay);

            //昨天没有签到
            if (lastDaySid == null){
                learnTimeMapper.updateContinueLearnDay(openId,1);
            }else {
                //昨天签到了
                learnTimeMapper.updateContinueLearnDay(openId,learnTime.getContinuous_learn() + 1);
                //判断现在的连续天数是否大于总天数
                if (learnTime.getAll_learn() < (learnTime.getContinuous_learn() + 1)){
                    learnTimeMapper.updateMaxLearnDay(openId,learnTime.getContinuous_learn() + 1);
                }
            }
        }
    }

    @Override
    public LearnTimeVO isLearnThisDay(String openId) {

        //查今天和昨天是否有
        String yesterdaySid = learnTimeMapper.selectIsLearnThisDay(openId, DateUtil.formatToDayAndSupOneDay(new Date(),-1));
        String beforeYesterdaySid = learnTimeMapper.selectIsLearnThisDay(openId, DateUtil.formatToDayAndSupOneDay(new Date(),-2));
        String sid = learnTimeMapper.selectIsLearnThisDay(openId, DateUtil.formatToDay(new Date()));
        LearnTimeVO learnTimeVO = learnTimeMapper.selectLearnVoByOpenId(openId);

        if(learnTimeVO==null){
             learnTimeVO = new LearnTimeVO();
        }
        //没签到
        if (yesterdaySid == null){
            learnTimeVO.setIsLearnYesterday("0");
        }else {
            learnTimeVO.setIsLearnYesterday("1");
        }

        if (beforeYesterdaySid == null){
            learnTimeVO.setIsLearnBeforeYesterday("0");
        }else {
            learnTimeVO.setIsLearnBeforeYesterday("1");
        }

        if(sid == null){
            learnTimeVO.setIsLearn("0");
            return learnTimeVO;
        }else {
            //签到了
            learnTimeVO.setIsLearn("1");
            return learnTimeVO;
        }
    }
}
