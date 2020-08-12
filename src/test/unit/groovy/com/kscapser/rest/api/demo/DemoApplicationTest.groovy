package com.kscapser.rest.api.demo

import com.kscapser.rest.api.demo.controller.DemoController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class DemoApplicationTest extends Specification {

    @Autowired (required = false)
    private DemoController demoController

    def "when context is loaded then all expected beans are created"() {
        expect: "the demoController is created"
        demoController
    }
}
