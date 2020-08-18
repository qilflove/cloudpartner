package com.feng.eurekahi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class ControllerHi {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort(@RequestParam(value = "name") String name){
        return "eureka hi:"+name+"port:"+port;
    }
}
