package com.xjw.test;

import com.xjw.config.MainConfig;
import com.xjw.controller.UserController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
//        ConfigurableEnvironment environment = applicationContext.getEnvironment();
//        System.out.println(environment.getProperty("app.username"));
//        UserController userController = (UserController) applicationContext.getBean("userController");
//        userController.showUserService();

    }
}
