package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {

        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public List<User> getById(@RequestParam(name = "id") String id) {

        return userService.getById(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {

        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId) {
        userService.deleteUser(userId);
    }
}