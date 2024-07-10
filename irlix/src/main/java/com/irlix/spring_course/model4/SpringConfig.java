package com.irlix.spring_course.model4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public Head head1() {
        return new Head(10, 10);
    }

    @Bean
    @Scope("prototype")
    public Head head2() {
        return new Head(15, 18);
    }

    @Bean
    @Scope("prototype")
    public Head head3() {
        return new Head(13, 14);
    }

    @Bean
    @Scope("singleton")
    public Hydra hydra() {
        List<Head> heads = Arrays.asList(head1(), head2(), head3());
        return new Hydra("Hydra", heads);
    }
}
