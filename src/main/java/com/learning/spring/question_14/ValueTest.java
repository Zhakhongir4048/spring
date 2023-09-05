package com.learning.spring.question_14;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:value_test.properties")
@Getter
@Setter
@Slf4j
public class ValueTest {

    @Value("${value.from.file}")
    private String valueFromFile;
    @Value("${some:some default}")
    private String someDefault;
    @Value("${listOfValues}")
    private String[] valuesArray;

    @PostConstruct
    public void initMethod() {
        log.info("""

                ****************************************************\s
                Starting ValueTest from question_14
                valueFromFile = {}
                someDefault = {}
                valuesArray = {}
                ****************************************************""", valueFromFile, someDefault, valuesArray);
    }

}
