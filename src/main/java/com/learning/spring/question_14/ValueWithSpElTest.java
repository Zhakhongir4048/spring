package com.learning.spring.question_14;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:value_with_sp_el_test.properties")
@Getter
@Setter
@Slf4j
public class ValueWithSpElTest {

    @Value("#{1*3}")
    private String spElValue;
    @Value("#{valueTest.valueFromFile}")
    private String valueTestValueFromFile;
    @Value("#{'${listOfValues}'.split(',')}")
    private List<String> valuesList;
    @Value("#{'${fuckUp}'}")
    private String fuckUp;

    @PostConstruct
    public void initMethod() {
        log.info("""

                        ****************************************************\s
                        Starting ValueWithSpElTest from question_14
                        spElValue = {}
                        valueTestValueFromFile = {}
                        valuesList = {}
                        fuckUp = {}
                        ****************************************************""",
                spElValue, valueTestValueFromFile, valuesList, fuckUp);
    }

}