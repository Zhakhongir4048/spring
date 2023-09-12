package com.learning.spring.question_29.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class RequestResponseLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        log.info(
                """
                          
                        ******************************************************
                        Starting RequestResponseLoggingFilter from question_29
                        "Logging Request  {} : {}"
                        """,
                httpServletRequest.getMethod(),
                httpServletRequest.getRequestURI());
        chain.doFilter(request, response);
        log.info(
                """
                            
                        Logging Response : {}
                        Finish RequestResponseLoggingFilter from question_29
                        ******************************************************
                        """,
                httpServletResponse.getContentType());
    }

}