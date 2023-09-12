package com.learning.spring.question_29.filters;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
@Order(10)
public class TransactionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        log.info("""
                                
                ******************************************************
                Starting TransactionFilter from question_29
                Starting a transaction for request : {}
                """, httpServletRequest.getRequestURL());
        chain.doFilter(request, response);
        log.info("""
                                
                Committing a transaction for request : {}
                Finish TransactionFilter from question_29
                ******************************************************
                """, httpServletRequest.getRequestURL());
    }

}