package com.irlix.spring_course.model1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class IrlixApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
        Person bob = context.getBean("spongeBob", Person.class);
        Person patrick = context.getBean("patrick", Person.class);
        Person squidward = context.getBean("squidward", Person.class);
        System.out.printf("%s\n %s\n %s\n", bob, patrick, squidward);
        context.close();
    }
}

