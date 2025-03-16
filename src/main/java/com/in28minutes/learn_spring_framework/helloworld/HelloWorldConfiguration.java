package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){};
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
        return new Person("GOLLA", 29,new Address("20 baker street", "London"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person2Parameters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }

    @Bean
    public Address address(){
        return new Address("Mohammadpur", "Dhaka");
    }

    @Bean
    public Address address2(){
        return new Address("Badda", "Dhaka");
    }


}
