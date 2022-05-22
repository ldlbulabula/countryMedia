package com.ldl.mapper;

import com.ldl.bean.PPt;
import org.apache.ibatis.annotations.Param;

public interface PPTMapper {
    PPt selectPPTByPid(@Param("pid") int pid);
}
