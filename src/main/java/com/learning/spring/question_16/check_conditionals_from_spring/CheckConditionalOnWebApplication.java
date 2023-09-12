package com.learning.spring.question_16.check_conditionals_from_spring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

@ConditionalOnWebApplication
@Component
public class CheckConditionalOnWebApplication {

    /**
     * Этот conditional вернёт true, так как это веб-приложение
     * Init метод сработает
     */
    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnWebApplication is success");
    }

}