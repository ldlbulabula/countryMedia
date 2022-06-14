package com.ldl.mapper;

import com.ldl.bean.Concern;
import com.ldl.bean.VO.VideoVo;
import com.ldl.bean.Vedio0;
import com.ldl.bean.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {
    Integer uploadVideo(Video video);

    VideoVo selectVideo(@Param("vid")String vid);

    Concern selectConcernBy(@Param("uid") String uid,@Param("buid") String buid);

    int insertConcern(@Param("uid") String uid,@Param("buid")String buid);

    int deleteConcern(@Param("uid") String uid,@Param("buid")String buid);

    List<Vedio0> selectVideoByCid(@Param("c_title")String c_title);

    List<String> selectMusicByCid(@Param("c_title")String cid);

    List<String> selectPictureByCid(@Param("c_title")String cid);
}
