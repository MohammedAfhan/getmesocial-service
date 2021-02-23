package com.example.getmesocialservice.Service;

import com.example.getmesocialservice.Model.User;
import com.example.getmesocialservice.Repository.UserRepository;
import com.example.getmesocialservice.Resource.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();
    }
}
