package com.example.accountingapprestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingForAppController {
    @GetMapping
    public String sayHello(){
        return "Hi!Test!2";
    }

    @GetMapping("/random")
    public String getNumber(){
        double value = Math.random()*100;
        return "Created Number: " + value;
    }
    @GetMapping("/sentence")
    public String getSentence(){
        return "First Sentence";
    }
}
