package com.le.ssm.service;

public interface LoginService {
    boolean hasMatchA(String username, String password);

    boolean hasMatchB(String username, String password);

    boolean hasMatchC(String username, String password);
}
