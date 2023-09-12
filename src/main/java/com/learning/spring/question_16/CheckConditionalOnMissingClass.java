package com.learning.spring.question_16;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Component;

@ConditionalOnMissingClass("TestPeople.class")
@Component
public class CheckConditionalOnMissingClass {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnMissingClass is success");
    }

}