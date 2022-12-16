package com.le.ssm.mapper;

import org.apache.ibatis.annotations.Param;

public interface BMapper {
    int getMatchCount(@Param("username") String username, @Param("password") String password);
}
