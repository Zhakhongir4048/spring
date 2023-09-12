package com.learning.spring.question_16.check_conditionals;

import jakarta.annotation.PostConstruct;
import jdk.security.jarsigner.JarSigner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

/**
 * Можно так @ConditionalOnClass(name = "jdk.security.jarsigner.JarSigner")
 */
@ConditionalOnClass(JarSigner.class)
@Component
public class CheckConditionalOnClass {

    @PostConstruct
    public void initMethod() {
        System.out.println("CheckConditionalOnClass is success");
    }

}