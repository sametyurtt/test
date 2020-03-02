package com.example.demo.controller;


import com.example.demo.entity.Greeting;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }

    @PostMapping(path = "/greeting/post")
    public Greeting createGreeting(@RequestBody Greeting greeting){
        return greeting;
    }

    @PutMapping(value = "/greeting/update")
    public Greeting updateGreeting(@RequestBody Greeting greeting, Long id){
        return greeting;
    }

    @DeleteMapping(value = "/greeting/delete")
    public Greeting deleteGreeting(long id, Greeting greeting){
        return new Greeting(22, "newDeleted");
    }

}
