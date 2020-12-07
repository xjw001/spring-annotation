package com.xjw.BeanProxy;

public class RealSubject implements Subject {

    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public Integer sayGoodBye() {
        return 1;
    }
}
