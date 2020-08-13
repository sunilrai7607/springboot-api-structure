package com.kscapser.rest.api.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService{
    /**
     * Method to say hello
     *
     * @return
     */
    @Override
    public String sayHello() {
        return "Hello Sunil";
    }
}
