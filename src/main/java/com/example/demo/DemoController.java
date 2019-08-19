package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String privateIndex() {
        return "hello. I am a secret";
    }

    @GetMapping("/public")
    @ResponseBody
    public String publicIndex() {
        return "I have nothing to hide";
    }




}
