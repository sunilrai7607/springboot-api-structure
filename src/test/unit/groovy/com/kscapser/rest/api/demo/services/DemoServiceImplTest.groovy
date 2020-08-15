package com.kscapser.rest.api.demo.services

import com.kscapser.rest.api.demo.service.impl.DemoServiceImpl
import spock.lang.Specification


class DemoServiceImplTest extends Specification {

    DemoService demoService

    def setup(){
        demoService = new DemoServiceImpl()
    }

    def "when demoService is loaded then all expected beans are created"() {
        expect: "the demoService is created"
        demoService != null
    }

    def "when demoService call sayHello"() {
        when: "the demoService is created"
            def response = demoService.sayHello()
        then:
            response.equalsIgnoreCase("Hello Sunil")

    }
}