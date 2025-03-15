package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {
    public static void main(String[] args) {
        //1: launch the spring context
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want Spring to manage -@Configuration
        System.out.println("-->> "+context.getBean("name"));
        System.out.println("-->> "+context.getBean("age"));
        System.out.println("-->> "+context.getBean("person"));
        System.out.println("-->> "+context.getBean("address"));
    }
}
