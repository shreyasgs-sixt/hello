package com.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String welcome(){
        return "Hello Shreyas GS\nWelcome to SIXT";
    }
}
