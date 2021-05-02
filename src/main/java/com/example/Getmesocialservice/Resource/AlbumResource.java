package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.Album;
import com.example.Getmesocialservice.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping
    public List<Album> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/find")
    public List<Album> getById(@RequestParam(name="id") String id){
        return albumService.getById(id);
    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album){
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name="albumId") String albumId){
        albumService.deleteAlbum(albumId);
    }
}
