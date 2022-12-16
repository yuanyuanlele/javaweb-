package com.le.ssm.service.impl;

import com.le.ssm.mapper.AMapper;
import com.le.ssm.mapper.BMapper;
import com.le.ssm.mapper.CMapper;
import com.le.ssm.pojo.A;
import com.le.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AMapper aMapper;
    @Autowired
    private BMapper bMapper;
    @Autowired
    private CMapper cMapper;
    @Override
    public boolean hasMatchA(String username, String password) {
        return aMapper.getMatchCount(username, password) == 1;
    }

    @Override
    public boolean hasMatchB(String username, String password) {
        return bMapper.getMatchCount(username, password) == 1;
    }

    @Override
    public boolean hasMatchC(String username, String password) {
        return cMapper.getMatchCount(username, password) == 1;
    }
}
