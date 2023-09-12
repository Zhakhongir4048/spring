package com.learning.spring.question_16.conditions;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.NoneNestedConditions;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

public class OnConditionNotBestPractice extends NoneNestedConditions {

    public OnConditionNotBestPractice() {
        super(REGISTER_BEAN);
    }

    @ConditionalOnProperty(value = "solid", havingValue = "true")
    public static class Solid {
    }

    @ConditionalOnProperty(value = "dry", havingValue = "true")
    public static class Dry {
    }

    @ConditionalOnProperty(value = "tdd", havingValue = "true")
    public static class Tdd {
    }

}