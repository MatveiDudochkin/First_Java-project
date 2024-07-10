package com.irlix.spring_course.model3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.irlix.spring_course.model3")
public class SpringConfig {
    @Bean
    public MilkProducts milk() {
        MilkProducts milk = new MilkProducts();
        milk.setFatPercent(3.5);
        milk.setProductName("milk");
        return milk;
    }

    @Bean
    public MilkProducts kefir() {
        MilkProducts kefir = new MilkProducts();
        kefir.setFatPercent(1.5);
        kefir.setProductName("kefir");
        return kefir;
    }
}
