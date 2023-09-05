package com.learning.spring.question_6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configQuestion6")
public class ConfigQuestion6 {

    @Bean(value = "animal",
            initMethod = "initMethod",
            destroyMethod = "destroyMethod",
            autowireCandidate = false)
    public Animal animal() {
        return new Animal();
    }

}