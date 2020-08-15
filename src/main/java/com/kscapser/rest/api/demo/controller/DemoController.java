package com.kscapser.rest.api.demo.controller;

import com.kscapser.rest.api.demo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok(demoService.sayHello());
    }
}
