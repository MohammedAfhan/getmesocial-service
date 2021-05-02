package com.example.Getmesocialservice.Service;

import com.example.Getmesocialservice.Model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Getmesocialservice.Repository.AlbumRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return (Album) albumRepository.save(album);
    }

    public List<Album> getAllAlbums(){
        return albumRepository.findAll();
    }

    public List<Album> getById(String id){
        return albumRepository.findAllById(id);
    }

    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumId){
        albumRepository.deleteById(albumId);
    }
}
