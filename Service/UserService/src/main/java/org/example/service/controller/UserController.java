package org.example.service.controller;

import org.example.service.entity.User;
import org.example.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    Environment environment;

    @Autowired
    private UserService userService;

    @GetMapping("port")
    public String port() {
        return environment.getProperty("local.server.port");
    }

    @GetMapping(value = "findAll", produces = "application/json")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "findById", produces = "application/json")
    public User findById(long userId) {
        return userService.findById(userId);
    }
}
