package com.css.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by kishore on 20/1/17.
 */
public class CustomerBeforeMethodAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Customer : Before Advice executed...!");
    }
}
