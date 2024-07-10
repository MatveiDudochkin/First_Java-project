package com.irlix.spring_course.model3;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fridge {
    private String model;
    private List<Object> foodList;

    public Fridge(List<Object> foodList) {
        this.model = "Fridge Indesit";
        this.foodList = foodList;
    }

    public void addProducts() {
        foodList.forEach(food -> System.out.println(food));
    }

}
