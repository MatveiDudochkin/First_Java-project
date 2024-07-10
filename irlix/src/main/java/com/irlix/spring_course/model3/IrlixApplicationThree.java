package com.irlix.spring_course.model3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IrlixApplicationThree {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Fridge fridge = context.getBean(Fridge.class);
        fridge.addProducts();
    }
}
