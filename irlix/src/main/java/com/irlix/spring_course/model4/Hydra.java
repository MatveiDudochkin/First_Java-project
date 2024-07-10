package com.irlix.spring_course.model4;

import java.util.List;

public class Hydra {
    private String name;
    private List<Head> listOfHeads;

    public Hydra(String name, List<Head> listOfHeads) {
        this.name = name;
        this.listOfHeads = listOfHeads;
    }

    @Override
    public String toString() {
        return "Hydra{name='" + name + "', listOfHeads=" + listOfHeads + '}';
    }
}
