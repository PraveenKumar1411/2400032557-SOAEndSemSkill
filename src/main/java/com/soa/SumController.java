package com.soa.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @Value("${app.a}")
    private int a;

    @Value("${app.b}")
    private int b;

    @GetMapping("/sum")
    public int getSum() {
        return a + b;
    }
}