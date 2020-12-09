package com.xjw.controller;

import com.xjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void showUserService(){
        userService.setUserInfo();
    }

}
