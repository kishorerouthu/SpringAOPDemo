package com.css.spring.aop.services;

/**
 * Created by kishore on 20/1/17.
 */
public class CustomerService {

    private String name;

    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Customer name : " + this.name);
    }

    public void printUrl() {
        System.out.println("Customer url : " + this.url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}
