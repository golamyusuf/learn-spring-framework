package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {
    public static void main(String[] args) {
        //1: launch the spring context
         try(var context
                     = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
             //2: Configure the things that we want Spring to manage -@Configuration
             System.out.println("-->> " + context.getBean("name"));
             System.out.println("-->> " + context.getBean("age"));
             System.out.println("-->> " + context.getBean("person"));
             System.out.println("-->> " + context.getBean("address"));
             System.out.println("-->> " + context.getBean("person2MethodCall"));
             System.out.println("-->> " + context.getBean("person2Parameters"));
         }

    }
}
