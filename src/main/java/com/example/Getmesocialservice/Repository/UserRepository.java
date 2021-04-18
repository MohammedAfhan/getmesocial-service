package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> userList = new ArrayList();

    public User getUser(){
        User user = new User("Afhan","# 7 M.G Road B'lore", 25,"www.google.com");
        return user;
    }

    public User saveUser(User user) {

        userList.add(user);
        return user;
    }

    public User allUser(User user) {

        return allUser(user);
    }


}