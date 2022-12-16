package com.le.ssm.mapper;

import com.le.ssm.pojo.D;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DMapper {
    void insertD(@Param("dbalance") int dbalance,@Param("dbool") boolean dbool, @Param("aid") int aid);
    
    List<D> getAllD();

    void updateBoolByDid(int did);
}
