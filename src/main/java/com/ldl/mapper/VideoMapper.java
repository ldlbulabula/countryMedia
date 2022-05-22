package com.ldl.mapper;

import com.ldl.bean.Concern;
import com.ldl.bean.VO.VideoVo;
import com.ldl.bean.Video;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    Integer uploadVideo(Video video);

    VideoVo selectVideo(@Param("vid")int vid);

    Concern selectConcernBy(@Param("uid") int uid,@Param("buid") int buid);

    int insertConcern(@Param("uid") int uid,@Param("buid")int buid);

    int deleteConcern(@Param("uid") int uid,@Param("buid")int buid);
}
