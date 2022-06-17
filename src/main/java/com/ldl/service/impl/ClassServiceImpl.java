package com.ldl.service.impl;
import com.ldl.Util.DateUtil;
import com.ldl.Util.ObsUtil;
import com.ldl.bean.Class;
import com.ldl.bean.Concern;
import com.ldl.bean.VO.*;
import com.ldl.bean.WatchingResult;
import com.ldl.bean.dto.ClassDto;
import com.ldl.mapper.ClassMapper;
import com.ldl.mapper.HistoryMapper;
import com.ldl.mapper.StarMapper;
import com.ldl.mapper.VideoMapper;
import com.ldl.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private HistoryMapper historyMapper;
    @Autowired
    ClassMapper classMapper;
    @Autowired
    @Qualifier("with_Hms")
    SimpleDateFormat simpleDateFormat;

    @Autowired
    StarMapper starMapper;

    @Autowired
    private VideoMapper videoMapper;


    /*
    * 老师端上传课程
    * */
    @Override
    public Class uploadClass(Class clazz) {
        System.out.println("来到了uploadClass的service"+simpleDateFormat.format(new Date()));
        List<String> music =null;
        List<String> picture =null;
        List<String> video =null;
        try {
            classMapper.insertClass(clazz);//让课程获得数据库的主键
            music = clazz.getMusic();
            picture =clazz.getPicture();
            video =clazz.getVideo();

            if(music!=null&&music.size()!=0){
                classMapper.addClass_music(clazz.getClass_id(), music);
            }

            if(picture!=null&&picture.size()!=0){
                classMapper.addClass_picture(clazz.getClass_id(), picture);
            }
            if(video!=null&&video.size()!=0){
                classMapper.addClass_video(clazz.getClass_id(), video);
            }

            if(clazz.getCover()!=null){
                classMapper.addClass_cover(clazz.getClass_id(), clazz.getCover());
            }

        } catch (Exception ignored) {

        }

        return new Class(clazz.getClass_id(),
                clazz.getC_title(),
                clazz.getC_summary(),
                clazz.getType(),
                music,
                picture,
                video,
                clazz.getCover(),
                clazz.getTeacher(),
                clazz.getUploadDate(),"0","0");
    }


    @Override
    public String uploadFile(MultipartFile file) {
        return ObsUtil.uploadFile(file);
    }

    @Override
    public List<Class> getAllClass() {
        return classMapper.getAllClass();
    }

    @Override
    public List<Class> getLatestClass() {
        return classMapper.getLatestClass();
    }

    @Override
    public ClassVo getClassIdVo() {
        List<ClassIdVo> allClassIdVo = classMapper.selectClassVos();
        List<ClassIdVo> classIdVoComment = classMapper.selectClassVosComment(3);
        return new ClassVo(classIdVoComment,allClassIdVo);
    }

    @Override
    public ClassVo1 getClassByCid(String cid, String openid) {
        String starId = starMapper.selectStar(openid, cid);
        String likeId = starMapper.selectLike(openid, cid);

        //点赞和收藏
        if (likeId == null){
            starMapper.insertLike(cid, openid);
        }

        if (starId == null){
            starMapper.insertStar(cid, openid);
        }

        //新增历史的记录
        String hid = historyMapper.selectHistory(cid, openid);

        if (hid != null){
            historyMapper.updateHistory(hid,simpleDateFormat.format(new Date()));
        }else {
            historyMapper.insertHistory(openid,cid,simpleDateFormat.format(new Date()));
        }

        //更新连续学习天数的状态



        ClassVo1 classVo1 = classMapper.selectClassById(cid, openid);

        Concern concern = videoMapper.selectConcernBy(openid, classVo1.getTeacher().getopenid());

        //是否关注了
        if (concern == null){
            classVo1.setIsConcernTeacher("0");
        }else {
            classVo1.setIsConcernTeacher("1");
        }

        return classVo1;
    }

    @Override
    public List<StarClassVo> getStarClass(String openId) {
        return classMapper.selectStarClass(openId);
    }

    @Override
    public List<StarClassVo> getHistoryClass(String openId) {
        return classMapper.selectHistory(openId);
    }

    @Override
    public int deleteClassByCid(String class_id) {
        return classMapper.deleteClassByCid(class_id);
    }

    @Override
    public StudyTimeVo getStudyTimeVo(String openId) {

        if(classMapper.selectAllStudyTime(openId) == null){
            classMapper.insertAllStudyTime(openId);
        }
        if (classMapper.selectStudyTime(openId,DateUtil.formatToDay(new Date())) == null){
            classMapper.insertStudyTime(openId,DateUtil.formatToDay(new Date()));
        }

        StudyTimeVo studyTimeVo = classMapper.selectStudyTimeByOpenId(openId, DateUtil.formatToDay(new Date()));
        List<StarClassVo> starClassVos = classMapper.selectHistory(openId);
        studyTimeVo.setClassVo(starClassVos);
        WatchingResult allStudyTime = DateUtil.getWatchingResult(studyTimeVo.getAllStudyTime());
        WatchingResult thisDayTime = DateUtil.getWatchingResult(studyTimeVo.getThisDayTime());
        studyTimeVo.setAllStudyTimeResult(allStudyTime);
        studyTimeVo.setThisDayTimeResult(thisDayTime);
        return studyTimeVo;
    }

    @Override
    public WatchingResult updateStudyTime(String openId, String start, String end) {
        BigInteger endTime = new BigInteger(end);
        BigInteger startTime = new BigInteger(start);
        long addTime =endTime.subtract(startTime).longValue();
        if(classMapper.selectAllStudyTime(openId) == null){
            classMapper.insertAllStudyTime(openId);
        }
        if (classMapper.selectStudyTime(openId,DateUtil.formatToDay(new Date())) == null){
            classMapper.insertStudyTime(openId,DateUtil.formatToDay(new Date()));
        }

        classMapper.updateStudyTime(addTime,DateUtil.formatToDay(new Date()),openId);
        classMapper.updateAllStudyTime(addTime,openId);
        return DateUtil.getWatchingResult(startTime,endTime);
    }

    @Override
    public int updateClass(ClassDto classDto) {
        classDto.setUpdateTime(simpleDateFormat.format(new Date()));
        classMapper.updateClass(classDto);
        String cid = classDto.getCid();

        if("1".equals(classDto.getCoverDto().getIsUpdateCover())){
            classMapper.updateCoverByCid(cid,classDto.getCoverDto().getCover());
        }

        if ( "1".equals(classDto.getMusicDto().getIsUpdateMusic())  ){
            classMapper.deleteMusic(Integer.parseInt(cid));
            classMapper.addClass_music(Integer.parseInt(cid),classDto.getMusicDto().getMusics());
        }

        if ("1".equals(classDto.getVideoDto().getIsUpdateVideo())){
            classMapper.deleteVideo(Integer.parseInt(cid));
            classMapper.addClass_video(Integer.parseInt(cid),classDto.getVideoDto().getVideos());
        }

        if ("1".equals(classDto.getPictureDto().getIsUpdatePicture())){
            classMapper.deletePicture(Integer.parseInt(cid));
            classMapper.addClass_picture(Integer.parseInt(cid),classDto.getPictureDto().getPictures());
        }

        return 1;
    }

    @Override
    public List<Class> getClassByType(String type) {

        return classMapper.getClassByType(type);
    }

    @Override
    public List<Class> getConcernClass(String openid) {

        return classMapper.getConcernClass(openid);
    }

    @Override
    public List<StarClassVo> getlatestLearning(String openid) {

        return classMapper.getlatestLearning(openid);
    }


}
