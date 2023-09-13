package com.learning.spring.question_29.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class LoggerInterceptor implements HandlerInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        LOGGER.info("""

                        LoggerInterceptor starting preHandle
                        Data method :
                        {
                            {},
                            {},
                            {},
                            {},
                            {}
                        }

                        """, request.getMethod(), request.getRequestURL(), request.getServerName(),
                response.getHeaderNames(), handler.getClass());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        assert modelAndView != null;
        LOGGER.info("""

                        LoggerInterceptor starting postHandle
                                Data method :
                                {
                                    {},
                                    {},
                                    {},
                                    {},
                                    {},
                                    
                                }
                                       
                                """, request.getMethod(), request.getRequestURL(), request.getServerName(),
                response.getHeaderNames(), handler.getClass());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        request.getMethod();
        response.getHeaderNames();
        System.out.println(handler.getClass());
        if (ex != null) {
            ex.printStackTrace();
        }
        LOGGER.info("""
                                        
                        LoggerInterceptor starting afterCompletion
                                Data method :
                                {
                                    {},
                                    {},
                                    {},
                                    {},
                                    {},
                                }
                                                
                                """, request.getMethod(), request.getRequestURL(), request.getServerName(),
                response.getHeaderNames(), handler.getClass());
    }

}