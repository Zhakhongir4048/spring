package com.learning.spring.question_16.conditions.annotations;

import com.learning.spring.question_16.conditions.OnConditionHealth;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnConditionHealth.class)
public @interface ConditionalOnHealth {
}