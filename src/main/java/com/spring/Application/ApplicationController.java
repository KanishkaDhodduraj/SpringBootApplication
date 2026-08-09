package com.spring.Application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApplicationController {
    @GetMapping("/demo")

    String sayHello() {
        return "Hello Kanishka";
    }
}