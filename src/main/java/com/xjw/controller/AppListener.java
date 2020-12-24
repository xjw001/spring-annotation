package com.xjw.controller;

import com.xjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;


public class AppListener implements ApplicationListener {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(userService);
    }
}
