package com.example.accountingapprestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingForAppController {

    @GetMapping("/sentence")
    public String getSentence(){
        return "First Sentence";
    }
}
