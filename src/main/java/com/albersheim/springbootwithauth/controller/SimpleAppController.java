package com.albersheim.springbootwithauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class SimpleAppController {
    
    @RequestMapping("/")
    String home() {
        return "home";
    }

    @RequestMapping("/restricted")
    String restricted() {
        return "restricted";
    }
}