package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser(){
        User user = new User("Afhan","# 7 M.G Road B'lore", 25,"www.google.com");
        return user;
    }
}
