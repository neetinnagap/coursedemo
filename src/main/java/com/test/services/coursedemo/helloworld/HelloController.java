package com.test.services.coursedemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/helloworld2")
    public String helloWorldDirectMapping() {
        return "Hello World!";
    }

    @GetMapping(path = "/helloworldbean")
    public HelloWorld helloWorldUsingBean() {
        return new HelloWorld("Hello World!");
    }
}
