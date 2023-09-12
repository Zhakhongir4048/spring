package com.learning.spring.question_16;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "custom")
public class CustomProperties {

    private Boolean included;

}