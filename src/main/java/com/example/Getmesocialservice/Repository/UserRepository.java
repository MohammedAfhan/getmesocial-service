package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
