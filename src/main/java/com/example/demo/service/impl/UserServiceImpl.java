package com.example.demo.service.impl;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    private  final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        logger.info("/queryAllUsers start...");
        return userMapper.queryAllUsers();
    }

    @Override
    public User selectOneUser(String id) {
        User user=new User();
        user.setId(Integer.parseInt(id));
        return userMapper.selectOneUser(user);
    }
}
