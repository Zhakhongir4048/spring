package com.learning.spring.question_6;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Animal {

    @PostConstruct
    public void initMethod() {
        System.out.println("Class - ConfigQuestion6, Bean - animal, initMethod");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Class - ConfigQuestion6, Bean - animal, destroyMethod");
    }

}