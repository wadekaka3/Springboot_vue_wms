package com.wms.controller;

import com.wms.entity.User;
import com.wms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Brian
 * @version 1.0
 */
@RestController
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello wms";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
//        return userService.list();
        return userService.listAll();
    }

}