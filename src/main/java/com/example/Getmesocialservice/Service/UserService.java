package com.example.Getmesocialservice.Service;

import com.example.Getmesocialservice.Model.User;
import com.example.Getmesocialservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
/*

    public User getUser(){
        return userRepository.getUser();
    }



    public User allUser(User user) {
        return userRepository.allUser(user);
    }
*/
}
