package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.Photo;
import com.example.Getmesocialservice.Service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class PhotoResource {

    @Autowired
    private PhotoService photoService;

    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping("/find")
    public List<Photo> getById(@RequestParam(name="id") String id){
        return photoService.getById(id);
    }

    @PutMapping
    public Photo updatePhoto(@RequestParam Photo photo){
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name="photoId") String photoId){
        photoService.deletePhoto(photoId);
    }
}
