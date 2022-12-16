package com.le.ssm.service.impl;

import com.le.ssm.mapper.DMapper;
import com.le.ssm.pojo.D;
import com.le.ssm.service.DService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DServiceImpl implements DService {
    @Autowired
    private DMapper dMapper;
    @Override
    public void insertD(int dbalance, boolean dbool, int aid) {
        dMapper.insertD(dbalance,dbool,aid);
    }

    @Override
    public List<D> getAllD() {
        return dMapper.getAllD();
    }

    @Override
    public void updateBoolByDid(int did) {
        dMapper.updateBoolByDid(did);
    }
}
