package com.demo.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String welcome(){
        return "Hello Shreyas GS\nWelcome to SIXT";
    }

    @GetMapping("/square")
    public ResponseEntity<Integer> getSquare(@RequestParam int n) {
        return ResponseEntity.ok(n*n);
    }
}
