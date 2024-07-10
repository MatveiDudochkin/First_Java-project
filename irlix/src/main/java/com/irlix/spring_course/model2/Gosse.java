package com.irlix.spring_course.model2;

import org.springframework.stereotype.Component;

@Component
public class Gosse extends Animal {
    public Gosse() {
        super("Goosee");
    }

    @Override
    public void sayBeforeDeath() {
        System.out.println("Кря Кря!");
    }
}
