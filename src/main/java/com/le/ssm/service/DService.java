package com.le.ssm.service;

import com.le.ssm.pojo.D;

import java.util.List;

public interface DService {
    void insertD(int dbalance, boolean dbool, int aid);

    List<D> getAllD();

    void updateBoolByDid(int did);
}
