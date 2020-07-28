package org.example.client.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements UserService {
    @Override
    public String findAll() {
        return "[]";
    }

    @Override
    public String port() {
        return "0";
    }
}
