package org.example.service.service;

import org.example.service.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(long userId);
}
