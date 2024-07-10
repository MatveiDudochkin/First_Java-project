package com.irlix.spring_course.model1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Bean
    public Person spongeBob() {
        Person bob = new Person();
        bob.setAge(21);
        bob.setName("Sponge Bob");
        return bob;
    }

    @Bean
    public Person patrick() {
        Person patrick = new Person();
        patrick.setAge(22);
        patrick.setName("Patrick");
        return patrick;
    }

    @Bean
    public Person squidward() {
        Person squidward = new Person();
        squidward.setAge(-30);
        squidward.setName("Squidward");
        return squidward;
    }
}
