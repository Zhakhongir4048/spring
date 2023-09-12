package com.learning.spring.question_16.conditions;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@ConditionOnHealth
@Component
public class CheckConditionOnHealth {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionOnHealth is success");
    }

}