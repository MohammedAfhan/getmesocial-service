package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository <Comment, String>{
    List<Comment> findAllById(String id);
}
