package com.learning.spring.question_29.web_listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyAppServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Начал работу MyAppServletContextListener");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Завершил работу MyAppServletContextListener");
    }

}