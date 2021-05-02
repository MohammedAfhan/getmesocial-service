package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo,String> {
    List<Photo> findAllById(String id);
}
