package com.learning.spring.question_16.conditions;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@ConditionalOnBestPractice
@Component
public class CheckConditionalOnBestPractice {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnBestPractice is success");
    }

}