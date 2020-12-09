package com.xjw.config;

import com.xjw.aop.MathCalc;
import com.xjw.bean.Car;
import com.xjw.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(value = {"com.xjw.service","com.xjw.dao"})
public class MainConfigAutowired {

    @Bean
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

    @Profile("dev")
    @Bean
    public Car car(){
        return new Car();
    }


}
