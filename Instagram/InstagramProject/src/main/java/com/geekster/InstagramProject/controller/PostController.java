package com.geekster.InstagramProject.controller;

import com.geekster.InstagramProject.model.Post;
import com.geekster.InstagramProject.service.PostService;
import com.geekster.InstagramProject.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    TokenService authService;

    @PostMapping()
    public ResponseEntity<String> addPost(@Valid @RequestParam String email , @RequestParam String token , @RequestBody Post post){
        HttpStatus status;
        String msg = "";
        if(authService.authenticate(email,token))
        {
            postService.addPost(post);
            msg = " Post posted successfully";
            status = HttpStatus.OK;
        }
        else
        {
            msg = "Invalid user";
            status = HttpStatus.FORBIDDEN;
        }

        return new ResponseEntity<String>(msg , status);
    }

    @GetMapping()
    public ResponseEntity<List<Post>> getAllPosts(@RequestParam String email , @RequestParam String token){
        HttpStatus status;
        List<Post> postList = null;
        if(authService.authenticate(email,token))
        {
            postList = postService.getAllPosts(token);
            status = HttpStatus.OK;
        }
        else
        {

            status = HttpStatus.FORBIDDEN;
        }

        return new ResponseEntity<List<Post>>(postList , status);
    }
}
