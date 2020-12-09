package com.xjw.service.Impl;

import com.xjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UserServiceImpl2 implements UserService {
    @Override
    public void setUserInfo() {
        System.out.println("UserServiceImpl2");
    }
}
