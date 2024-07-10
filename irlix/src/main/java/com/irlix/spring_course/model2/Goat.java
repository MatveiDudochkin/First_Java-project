package com.irlix.spring_course.model2;

import org.springframework.stereotype.Component;

@Component
public class Goat extends Animal {
    public Goat() {
        super("Goatte");
    }

    @Override
    public void sayBeforeDeath() {
        System.out.println("Беееее!");
    }
}
