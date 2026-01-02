package com.orion.spring_boot_prometheus_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Prometheus";
    }
}
