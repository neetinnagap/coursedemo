package com.test.services.coursedemo.helloworld;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/helloworldbean/pathvariable/{name}")
    public HelloWorld helloWorldUsingBeanPathVar(@PathVariable String name) {
        return new HelloWorld(String.format("Hello World, %s", name));
    }
}
