package com.irlix.spring_course.model2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IrlixApplicationTwo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Hunter hunter = context.getBean(Hunter.class);
        Animal frog = context.getBean("frog", Animal.class);
        Animal goat = context.getBean("goat", Animal.class);
        Animal gosse = context.getBean("gosse", Animal.class);

        hunter.setCurrentAnimal(frog);
        hunter.killAnimal();

        hunter.setCurrentAnimal(goat);
        hunter.killAnimal();

        hunter.setCurrentAnimal(gosse);
        hunter.killAnimal();


        context.close();
    }
}



