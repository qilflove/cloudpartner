package com.feng.serverfeign.service;

import com.feng.serverfeign.service.impl.FeignServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-hi",fallback = FeignServiceFallBack.class)
public interface FeignService {
    @GetMapping(value = "/hi/port")
     String getStringByHi(@RequestParam(value = "name")String name);
}
