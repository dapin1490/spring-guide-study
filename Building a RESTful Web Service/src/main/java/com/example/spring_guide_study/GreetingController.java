package com.example.spring_guide_study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// handles GET requests for /greeting by returning a new instance of the Greeting class
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!"; // 반환할 데이터의 포맷 지정
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
