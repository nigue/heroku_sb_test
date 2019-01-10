package com.tapir.org.heroku_sb_test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tapir")
public class TestController {

    @RequestMapping("/api/helloworld")
    public ResponseEntity<BasicResponse> findAll(){
        BasicResponse result = new BasicResponse();
        result.setCode(1234);
        result.setMsg("asdfasdfasdf");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
