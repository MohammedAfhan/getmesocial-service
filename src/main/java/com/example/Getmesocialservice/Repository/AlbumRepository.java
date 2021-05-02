package com.example.Getmesocialservice.Repository;

import com.example.Getmesocialservice.Model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository <Album, String> {
 List<Album> findAllById(String id);
}
