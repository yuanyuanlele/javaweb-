package com.le.ssm.service;

import com.le.ssm.pojo.A;

import java.util.List;

public interface AServiece {
    void insertA(A a);
    List<A> getAllA();
    A selectAByAid(int Aid);
    void updateA(A a);
    void deleteAByAid(int aid);
    A selectAByusername(String username);
}
