package com.css.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

/**
 * Created by kishore on 20/1/17.
 */
public class CustomerAfterMethodAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Customer : After return Advice executed...!");
    }
}
