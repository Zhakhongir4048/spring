package com.learning.spring.question_20;

import org.springframework.beans.factory.FactoryBean;

import java.awt.*;
import java.util.Random;

public class ColorFactory implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        Random random = new Random();
        return new Color(random.nextInt(), random.nextInt(), random.nextInt());
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
