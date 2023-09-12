package com.learning.spring.question_16.check_conditionals_from_spring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.stereotype.Component;

@ConditionalOnNotWebApplication
@Component
public class CheckConditionalOnNotWebApplication {

    /**
     * Этот conditional вернёт false, так как это веб-приложение
     * Init метод не сработает
     */
    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnNotWebApplication is success");
    }

}