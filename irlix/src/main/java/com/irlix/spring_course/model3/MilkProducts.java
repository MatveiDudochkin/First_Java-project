package com.irlix.spring_course.model3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MilkProducts {
    private double fatPercent;
    private String productName;

    public double getFatPercent() {
        return this.fatPercent;
    }

    public void setFatPercent(double fatPercent) {
        this.fatPercent = fatPercent;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
