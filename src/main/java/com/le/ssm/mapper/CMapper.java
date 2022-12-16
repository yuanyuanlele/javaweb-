package com.le.ssm.mapper;

import org.apache.ibatis.annotations.Param;

public interface CMapper {
    int getMatchCount(@Param("username") String username, @Param("password") String password);
}
