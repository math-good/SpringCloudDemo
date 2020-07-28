package org.example.service.service.impl;

import org.example.service.entity.User;
import org.example.service.mapper.UserMapper;
import org.example.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(long userId) {
        return userMapper.findById(userId);
    }
}
