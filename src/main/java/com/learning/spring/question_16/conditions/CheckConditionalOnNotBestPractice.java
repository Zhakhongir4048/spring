package com.learning.spring.question_16.conditions;

import com.learning.spring.question_16.conditions.annotations.ConditionalOnNotBestPractice;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@ConditionalOnNotBestPractice
@Component
public class CheckConditionalOnNotBestPractice {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnNotBestPractice is success");
    }

}