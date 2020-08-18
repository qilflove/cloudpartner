package com.feng.serverribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorHi")
    public String getRibbonTest(String name){
        return restTemplate.getForObject("http://EUREKA-HI/hi/port?name="+name,String.class);
    }

    public String errorHi(String name){
        return "hi,"+name+",sorry,error!";
    }
}
