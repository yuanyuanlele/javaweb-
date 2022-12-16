package com.le.ssm.service.impl;

import com.le.ssm.mapper.AMapper;
import com.le.ssm.pojo.A;
import com.le.ssm.service.AServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AServiceImpl implements AServiece {
    @Autowired
    private AMapper aMapper;

    @Override
    public void insertA(A a) {
        aMapper.insertA(a);
    }

    @Override
    public List<A> getAllA() {
        return aMapper.getAllAList();
    }

    @Override
    public A selectAByAid(int Aid) {
        return aMapper.selectAByAid(Aid);
    }

    @Override
    public void updateA(A a) {
        aMapper.updateA(a);
    }

    @Override
    public void deleteAByAid(int aid) {
        aMapper.deleteAByAid(aid);
    }

    @Override
    public A selectAByusername(String username) {
        return aMapper.selectAByAname(username);
    }
}
