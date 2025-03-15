package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstLine,  String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Golam Yusuf";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("GOLLA", 29);
    }

    @Bean
    public Address address(){
        return new Address("Mohammadpur", "Dhaka");
    }


}
