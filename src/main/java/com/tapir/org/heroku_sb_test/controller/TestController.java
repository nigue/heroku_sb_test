package com.tapir.org.heroku_sb_test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tapir")
public class TestController {

    @Value( "${test.saludo}" )
    private String saludo;

    @RequestMapping("/api/helloworld")
    public ResponseEntity<BasicResponse> findAll(){
        BasicResponse result = new BasicResponse();
        result.setCode(200);
        result.setMsg(saludo);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
