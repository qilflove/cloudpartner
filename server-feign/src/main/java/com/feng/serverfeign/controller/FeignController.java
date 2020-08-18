package com.feng.serverfeign.controller;

import com.feng.serverfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/hi")
    public String getStringByHi(@RequestParam(value = "name")String name){
        return feignService.getStringByHi(name);
    }
}
