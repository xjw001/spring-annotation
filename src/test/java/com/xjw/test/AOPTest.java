package com.xjw.test;

import com.xjw.aop.MathCalc;
import com.xjw.config.MainConfigAOP;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigAOP.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
//        MathCalc mathCalc = (MathCalc) applicationContext.getBean("mathCalc");
//        try {
//            mathCalc.div(5,1);
//        } catch (Exception e) {
//            System.out.println("异常了");
//        }
    }
}
