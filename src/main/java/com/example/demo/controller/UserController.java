package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={"queryAllUsers"}, method= RequestMethod.GET)
    @GetMapping("/queryAllUsers")
    public List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }

    @ApiOperation(value="通过ID获取单个用户", notes="")
    @RequestMapping(value={"getUserById/{id}"}, method= RequestMethod.GET)
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") String id){
        return userService.selectOneUser(id);
    }
}
