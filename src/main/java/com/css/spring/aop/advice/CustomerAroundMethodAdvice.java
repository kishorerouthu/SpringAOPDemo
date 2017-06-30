package com.css.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by kishore on 21/1/17.
 */
public class CustomerAroundMethodAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("Method Name : " + methodInvocation.getMethod().getName());

        System.out.println("Method Arguments : " + methodInvocation.getArguments());

        //same as before method advice
        System.out.println("Customer Around Advice : Before Method Invocation");

        try {
            //proceed to actual method execution
            Object proceed = methodInvocation.proceed();

            //same as after method advice
            System.out.println("Customer Around Advice : After Method Invocation");

            return proceed;
        } catch (IllegalArgumentException e) {
            System.out.println("Customer Around Advice : Throw exception");
            throw e;
        }

    }
}
