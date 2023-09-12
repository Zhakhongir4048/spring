package com.learning.spring.question_16.check_conditionals_from_spring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.stereotype.Component;

@ConditionalOnJava(JavaVersion.SEVENTEEN)
@Component
public class CheckConditionalOnJava {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnJava is success");
    }

}