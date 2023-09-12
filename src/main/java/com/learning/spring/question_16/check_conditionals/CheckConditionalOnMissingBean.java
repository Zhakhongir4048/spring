package com.learning.spring.question_16.check_conditionals;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.JobMediaSheetsCompleted;

@ConditionalOnMissingBean(JobMediaSheetsCompleted.class)
@Component
public class CheckConditionalOnMissingBean {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnMissingBean is success");
    }

}