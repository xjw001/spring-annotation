package com.xjw.config;

import com.xjw.bean.BeanPostProcessorImpl;
import com.xjw.bean.Color;
import com.xjw.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;

@PropertySource(value = {"classpath:/person.properties"})
@Configuration
@ComponentScan(value={"com.xjw.controller","com.xjw.service","com.xjw.dao"})
public class MainConfig {


}
