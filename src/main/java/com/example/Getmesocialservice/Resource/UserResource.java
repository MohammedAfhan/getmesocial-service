package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    /*
    @GetMapping("/user")
    public User getUser(){
      return userService.getUser();

    }



    @PostMapping("/user{allUser}")
    public User allUser(@RequestBody User user){
        return userService.allUser(user);
    }
*/}
