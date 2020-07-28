package org.example.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "UserService", fallback = UserServiceFallback.class)
public interface UserService {
    @RequestMapping("findAll")
    String findAll();

    @RequestMapping("port")
    String port();
}
