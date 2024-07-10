package com.irlix.spring_course.model2;

import org.springframework.stereotype.Component;

@Component
public class Hunter {
    private Animal currentAnimal;

    public void setCurrentAnimal(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public void killAnimal() {
        System.out.println("Стреляю в " + currentAnimal.name + "\n Попал!");
        currentAnimal.sayBeforeDeath();
    }
}
