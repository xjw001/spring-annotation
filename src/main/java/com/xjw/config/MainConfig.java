package com.xjw.config;

import com.xjw.bean.Color;
import com.xjw.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value="com.xjw",excludeFilters = {
        @Filter(type = FilterType.ANNOTATION,classes = Controller.class)
})
@Import(value = {Color.class})
public class MainConfig {

    @Bean
    public Person person(){
        return  new Person("zhangsan",30);
    }
}
