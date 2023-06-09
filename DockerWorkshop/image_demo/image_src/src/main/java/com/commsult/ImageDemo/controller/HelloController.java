package com.commsult.ImageDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String greet() {
        LOG.info("Hello from Docker Workshop");

        return "Greetings from Docker Workshop";
    }
    
}
