package com.irlix.spring_course.model4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IrlixApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Hydra hydra = context.getBean(Hydra.class);
        System.out.println(hydra);
    }
}
