package com.irlix.spring_course.model4;


public class Head {
    private int quantityEye;
    private int quantityEars;

    public Head(int quantityEye, int quantityEars) {
        this.quantityEye = quantityEye;
        this.quantityEars = quantityEars;
    }

    @Override
    public String toString() {
        return "Head{quantityEye=" + quantityEye + ", quantityEars=" + quantityEars + '}';
    }
}
