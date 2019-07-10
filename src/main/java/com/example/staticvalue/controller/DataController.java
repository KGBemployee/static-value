package com.example.staticvalue.controller;

import com.example.staticvalue.components.StaticUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DataController {

    @GetMapping(path = "/getData")
    public String getData(){
        log.info("Get data called");
        return StaticUtils.url + StaticUtils.path;
    }
}
