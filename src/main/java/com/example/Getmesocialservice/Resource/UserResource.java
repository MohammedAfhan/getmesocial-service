package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(){
      return userService.getUser();

    }
}
