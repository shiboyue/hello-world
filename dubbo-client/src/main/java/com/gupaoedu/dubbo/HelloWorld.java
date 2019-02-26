package com.gupaoedu.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");


        //得到Igphello的远程调用
        for (int i = 0; i < 10; i++) {
            IGpHello iGpHello = (IGpHello) context.getBean("gpHelloService");
            System.out.println(iGpHello.sayHello("Mic"));
        }
    }
}
