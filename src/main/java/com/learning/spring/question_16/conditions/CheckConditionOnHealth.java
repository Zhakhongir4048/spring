package com.learning.spring.question_16.conditions;

import com.learning.spring.question_16.conditions.annotations.ConditionalOnHealth;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@ConditionalOnHealth
@Component
public class CheckConditionOnHealth {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionOnHealth is success");
    }

}