package com.learning.spring.question_16.conditions;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import static org.springframework.context.annotation.ConfigurationCondition.ConfigurationPhase.REGISTER_BEAN;

public class OnConditionBestPractice extends AllNestedConditions {

    public OnConditionBestPractice() {
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

    @ConditionalOnHealth
    public static class OnConditionHealth {
    }

}