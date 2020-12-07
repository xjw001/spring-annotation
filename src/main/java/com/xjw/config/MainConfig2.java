package com.xjw.config;

import com.xjw.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig2 {

    @Bean(initMethod = "",destroyMethod = "")
    public Car car(){
        return new Car();
    }
}
