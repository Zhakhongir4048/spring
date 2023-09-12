package com.learning.spring.question_16.check_conditionals;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(value = "custom.included", havingValue = "true")
@Component
public class CheckConditionalOnProperty {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnProperty is success");
    }

}