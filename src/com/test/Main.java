package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String []agvs){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Bean.xml");
        HelloWord helloWord = (HelloWord) context.getBean("helloWord");
        System.out.println(helloWord.getMessage());
    }
}
