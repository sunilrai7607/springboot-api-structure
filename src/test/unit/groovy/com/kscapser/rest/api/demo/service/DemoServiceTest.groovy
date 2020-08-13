package com.kscapser.rest.api.demo.service

import spock.lang.Specification


class DemoServiceTest extends Specification {

    IDemoService demoService

    def setup(){
        demoService = new DemoService()
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