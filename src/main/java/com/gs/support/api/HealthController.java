package com.gs.support.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Support Assistant is running";
    }
}