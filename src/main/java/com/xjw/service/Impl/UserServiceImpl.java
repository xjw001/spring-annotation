package com.xjw.service.Impl;

import com.xjw.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void setUserInfo() {
        System.out.println("UserServiceImpl");
    }
}
