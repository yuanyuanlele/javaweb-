package com.le.ssm.mapper;

import com.le.ssm.pojo.A;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AMapper {
    List<A> getAllAList();

    int insertA(A a);

    int getMatchCount(@Param("username") String username,@Param("password") String password);

    A selectAByAid(@Param("aid") int aid);

    int updateA(A a);

    int deleteAByAid(@Param("aid") int aid);

    A selectAByAname(@Param("username") String username);
}
