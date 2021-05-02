package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
 List<User> findAllById(String id);

}
