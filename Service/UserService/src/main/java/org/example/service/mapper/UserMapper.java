package org.example.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.service.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(long userId);
}
