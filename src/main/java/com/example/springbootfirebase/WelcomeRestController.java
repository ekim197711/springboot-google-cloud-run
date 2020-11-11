package com.example.springbootfirebase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RequestMapping
@RestController
public class WelcomeRestController {

    @GetMapping("/")
    public String ping()
    {
        return "pong! " + LocalDateTime.now().toString();
    }
}
