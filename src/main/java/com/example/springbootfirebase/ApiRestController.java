package com.example.springbootfirebase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @GetMapping("/important")
    public String importantInfo(){
        return "Trlalalalala";
    }
}
