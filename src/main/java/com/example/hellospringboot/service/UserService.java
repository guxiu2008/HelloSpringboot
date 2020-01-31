package com.example.hellospringboot.service;

import com.example.hellospringboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.example.hellospringboot.service
 * DESCRIPTION:
 *
 * @author guxiu2008
 * @create 2020-01-27 9:58
 **/
@Service
public class UserService {

    @Autowired
    private User user;

    public User getUser() {
        user.setName("Allan");
        user.setAge(30);
        return user;
    }
}
