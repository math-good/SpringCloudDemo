package org.example.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("findAll")
    public String findAll(){
        return restTemplate.getForObject("http://UserService/findAll", String.class);
    }
}
