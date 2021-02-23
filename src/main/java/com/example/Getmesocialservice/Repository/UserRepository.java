package com.example.getmesocialservice.Repository;

import com.example.getmesocialservice.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser(){
        User user = new User("Afhan","#7 M.G Road", 25, "C:\\Users\\AFHAN\\Desktop\\profile.png");
        return user;
    }
}
