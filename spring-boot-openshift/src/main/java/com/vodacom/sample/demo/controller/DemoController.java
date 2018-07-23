package com.vodacom.sample.demo.controller;

import com.vodacom.sample.demo.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/microservice")
@CrossOrigin(origins = {"*"})
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<Result> getResult() {
        Result result = new Result();
        result.setResponse("Hello World");

        return new ResponseEntity<Result>(result, HttpStatus.OK);
    }

}
