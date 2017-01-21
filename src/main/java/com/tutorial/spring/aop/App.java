package com.tutorial.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorial.spring.aop.services.CustomerService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceProxy");
        System.out.println("**********************");
        customerService.printName();
        System.out.println("**********************");
        customerService.printUrl();
        System.out.println("**********************");
        try {
            customerService.printThrowException();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

    }
}
