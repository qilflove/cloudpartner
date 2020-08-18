package com.feng.serverfeign.service.impl;

import com.feng.serverfeign.service.FeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class FeignServiceFallBack implements FeignService {

    @Override
    public String getStringByHi(String name) {
        return "sorry"+name;
    }
}
