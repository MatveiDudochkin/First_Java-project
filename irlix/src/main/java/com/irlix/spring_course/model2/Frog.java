package com.irlix.spring_course.model2;

import org.springframework.stereotype.Component;

@Component
public class Frog extends Animal {
    public Frog() {
        super("Frogge");
    }

    @Override
    public void sayBeforeDeath() {
        System.out.println("Ква Ква!");
    }
}
