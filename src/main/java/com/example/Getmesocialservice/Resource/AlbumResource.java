package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.Album;
import com.example.Getmesocialservice.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

        @Autowired
        private AlbumService albumService;

/*        @GetMapping("/album")
        public Album getAlbum(){
                return albumService.getAlbum();
        }


        @PostMapping("/album")
        public Album saveAlbum(@RequestBody Album album){
                return albumService.saveAlbum(album);
        }

        @GetMapping("/allAlbum")
        public  List<Album> getAllAlbum(){
                return albumService.getAllAlbum();
        }

        @GetMapping("/album/{albumId}")
        public Album getAlbumById(@PathVariable("albumId") int albumId){
                return albumService.getAlbumById(albumId);
        }
                        AFHAN CODE
*/

        @GetMapping("/album")

        public Album getAlbum() {
                return albumService.getAlbum();
        }

        @PostMapping("/album")
        public Album saveAlbum(@RequestBody Album album)
        {
                return albumService.saveAlbum(album);
        }
        @GetMapping("/allAlbums")
        public List<Album> getAllAlbums()
        {
                return albumService.getAllAlbum();
        }
        @GetMapping("/album/{albumId}")
        public Album getAlbumbyId(@PathVariable("albumId") int albumId)
        {
                return albumService.getAlbumById(albumId);
        }

        @PutMapping("/album/{albumId}")
        public Album updateAlbum(@PathVariable("albumId") int albumId, @RequestBody Album album)
        {
                return albumService.updateAlbum(albumId, album);
        }

        @DeleteMapping("/album")
        public Album deletedalbum(@RequestParam(name = "albumId") int albumId) {
                return albumService.deletedalbum(albumId);
        }

}
