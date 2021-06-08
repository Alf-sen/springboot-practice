package com.example.controller;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther lenovo
 * @date 2021/3/4 14:59
 */
@RestController
public class MyController {

    @Autowired
    User user;


    @GetMapping(value = "/user")
    public String getUser() {
        return "get user";
    }

    @PostMapping(value = "/user")
    public String postUser() {
        return "post user";
    }

    @PutMapping(value = "/user")
    public String putUser() {
        return "put user";
    }

    @DeleteMapping(value = "/user")
    public String deleteUser() {
        return "delete user";
    }


}
