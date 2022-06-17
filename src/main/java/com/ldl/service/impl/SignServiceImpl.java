package com.ldl.service.impl;

import com.ldl.Util.DateUtil;
import com.ldl.bean.Sign;
import com.ldl.bean.SignDateList;
import com.ldl.bean.VO.SignVo;
import com.ldl.mapper.SignMapper;
import com.ldl.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class SignServiceImpl implements SignService {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, -1);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(cal.getTime()));
    }

    @Autowired
    private SignMapper signMapper;

    @Override
    public void signThisDay(String openId) {

        //这步小程序可以避免
        String sid = signMapper.selectIsSignThisDay(openId, DateUtil.formatToDay(new Date()));
        if (sid != null){
            System.out.println("已签到");
            return;
        }

        Sign sign = signMapper.selectSidByOpenId(openId);
        Date date = new Date();
        signMapper.insertSign(openId,DateUtil.formatToDay(date));
        //第一次签到
        if (sign == null){
            signMapper.insertSignUser(openId,1,1);
        }else {
            //非第一次签到

            //判断上一天是否有签到
            String lastDay = DateUtil.formatToDayAndSupOneDay(date,-1);
            String lastDaySid = signMapper.selectIsSignThisDay(openId, lastDay);

            //昨天没有签到
            if (lastDaySid == null){
                signMapper.updateContinueSignDay(openId,1);
            }else {
                //昨天签到了
                signMapper.updateContinueSignDay(openId,sign.getContinuous_sign() + 1);
                //判断现在的连续天数是否大于总天数
                if (sign.getAll_sgin() < (sign.getContinuous_sign() + 1)){
                    signMapper.updateMaxSignDay(openId,sign.getContinuous_sign() + 1);
                }
              }
        }
    }


    @Override
    public SignVo isSignThisDay(String openId) {
        //查今天和昨天是否有
        String yesterdaySid = signMapper.selectIsSignThisDay(openId, DateUtil.formatToDayAndSupOneDay(new Date(),-1));
        String beforeYesterdaySid = signMapper.selectIsSignThisDay(openId, DateUtil.formatToDayAndSupOneDay(new Date(),-2));
        String sid = signMapper.selectIsSignThisDay(openId, DateUtil.formatToDay(new Date()));
        SignVo signVo = signMapper.selectSignVoByOpenId(openId);

        if(signVo==null){
            signVo = new SignVo();
        }

        //没签到
        if (yesterdaySid == null){
            signVo.setIsSignYesterday("0");
        }else {
            signVo.setIsSignYesterday("1");
        }

        if (beforeYesterdaySid == null){
            signVo.setIsSignBeforeYesterday("0");
        }else {
            signVo.setIsSignBeforeYesterday("1");
        }

        if(sid == null){
            signVo.setIsSign("0");
            return signVo;
        }else {
            //签到了
            signVo.setIsSign("1");
            return signVo;
        }

    }

    @Override
    public SignDateList getSignDateList() {
        Calendar today = DateUtil.formatToDayAndSupOneDay(0);
        return new SignDateList(
                today.get(Calendar.MONTH)+1,
                today.get(Calendar.DAY_OF_MONTH),
                DateUtil.formatToDayAndSupOneDay(-2).get(Calendar.DAY_OF_MONTH),
                DateUtil.formatToDayAndSupOneDay(-1).get(Calendar.DAY_OF_MONTH),
                today.get(Calendar.DAY_OF_MONTH),
                DateUtil.formatToDayAndSupOneDay(1).get(Calendar.DAY_OF_MONTH),
                DateUtil.formatToDayAndSupOneDay(2).get(Calendar.DAY_OF_MONTH)
        );

    }
}
