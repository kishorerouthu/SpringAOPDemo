package com.tutorial.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by kishore on 20/1/17.
 */
public class CustomerThrowExceptionAdvice implements ThrowsAdvice {

    public void afterThrowing(IllegalArgumentException iae) throws Throwable {
        System.out.println("Customer : Throw exception is executed...!");
    }

}
