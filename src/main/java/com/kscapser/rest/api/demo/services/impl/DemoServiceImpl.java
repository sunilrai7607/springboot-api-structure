package com.kscapser.rest.api.demo.services.impl;

import com.kscapser.rest.api.demo.services.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
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
