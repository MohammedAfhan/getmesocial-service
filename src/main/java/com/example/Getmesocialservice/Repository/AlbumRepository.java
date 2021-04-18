package com.example.Getmesocialservice.Repository;
import com.example.Getmesocialservice.Model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList();

    public Album getAlbum() {
        Album album = new Album(1001, "GMH", "Skill Development", "www.getmehired.co");
        return album;

    }

    public Album saveAlbum(Album album) {
        album.setAlbumId(albumList.size() + 1);
        albumList.add(album);
        return album;

    }


    public List<Album> getAllAlbum() {
        return albumList;
    }

    public Album getAlbumById(int albumId) {
        for (Album album : albumList) {
            if (album.getAlbumId() == albumId) {
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumId, Album album) {
        for (Album a : albumList) {
            if (a.getAlbumId() == albumId) {
                a.setName(album.getName());
                a.setAlbumId(album.getAlbumId());
                a.setDescription(album.getDescription());
                return a;
            }
        }
        return null;

    }

    public Album deletedalbum(int albumId) {
        Album deletedalbum=null;
        for (Album a:albumList){
            if (a.getAlbumId()==albumId){
                deletedalbum = a;
                albumList.remove(a);
                return deletedalbum;
            }
        }
        return null;
    }
}