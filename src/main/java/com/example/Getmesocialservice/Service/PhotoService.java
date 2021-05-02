package com.example.Getmesocialservice.Service;

import com.example.Getmesocialservice.Model.Photo;
import com.example.Getmesocialservice.Repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo){
        return photoRepository.save(photo);
    }

    public List<Photo> getAllPhotos(){
        return photoRepository.findAll();
    }

    public List<Photo> getById(String id){
        return photoRepository.findAllById(id);
    }

    public Photo updatePhoto(Photo photo){
        return photoRepository.save(photo);
    }

    public void deletePhoto(String photoId){
        photoRepository.deleteById(photoId);
    }
}
