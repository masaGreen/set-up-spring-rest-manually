package com.masaGreen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/greet")
    public String greet(){
        return "how do you do my friend";
    }
}
