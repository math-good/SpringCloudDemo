package org.example.client.controller;

import org.example.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("port")
    public String port() {
        return userService.port();
    }

    @GetMapping("findAll")
    public String findAll() {
        return userService.findAll();
    }
}
