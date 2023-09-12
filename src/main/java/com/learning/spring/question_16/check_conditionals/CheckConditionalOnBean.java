package com.learning.spring.question_16.check_conditionals;

import com.learning.spring.question_14.ValueTest;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@ConditionalOnBean(ValueTest.class)
@Component
public class CheckConditionalOnBean {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnBean is success");
    }

}