package com.xjw.config;

import com.xjw.aop.LogAspect;
import com.xjw.aop.MathCalc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(value = {"com.xjw.aop"})
public class MainConfigAOP {

    @Bean
    public MathCalc mathCalc(){
        return  new MathCalc();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
