package com.example.hellospringboot.controller;

import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.example.hellospringboot.control
 * DESCRIPTION:
 *
 * @author guxiu2008
 * @create 2020-01-27 9:59
 **/
@RequestMapping("user")
@RestController
@Api(value = "用户信息管理")
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @ApiOperation(value="获取用户",notes = "根据User对象获取用户")
    public User getUser() {
        return userService.getUser();
    }
}
