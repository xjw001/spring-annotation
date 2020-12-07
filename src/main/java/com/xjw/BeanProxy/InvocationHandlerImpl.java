package com.xjw.BeanProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvocationHandlerImpl implements InvocationHandler {

    private Object subject;

    public InvocationHandlerImpl(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前");
        Object value = method.invoke(subject, args);
        System.out.println("执行后");
        return value;
    }

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandlerImpl invocationHandler = new InvocationHandlerImpl(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class[] interfaces = subject.getClass().getInterfaces();
        Subject o = (Subject) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        System.out.println("出参:"+o.sayGoodBye());
        o.sayHello();

    }
}
