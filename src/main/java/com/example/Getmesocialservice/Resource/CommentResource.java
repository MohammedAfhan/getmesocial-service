package com.example.Getmesocialservice.Resource;

import com.example.Getmesocialservice.Model.Comment;
import com.example.Getmesocialservice.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/find")
    public List<Comment> getById(@RequestParam(name="id") String id){
        return commentService.getById(id);
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name="commentId") String commentId){
        commentService.deleteComment(commentId);
    }
}
