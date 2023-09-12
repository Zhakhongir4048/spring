package com.learning.spring.question_16.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

public class OnConditionHealth implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        metadata.getAnnotations();
        return Objects.equals(context.getEnvironment().getProperty("health"), "true");
    }

}
