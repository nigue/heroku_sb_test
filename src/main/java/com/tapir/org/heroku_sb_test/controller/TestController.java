package com.tapir.org.heroku_sb_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tapir")
public class TestController {

    @RequestMapping("/api/helloworld")
    public String findAll(){
        return "Hello World!";
    }
}
