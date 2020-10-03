package com.test.services.coursedemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}
