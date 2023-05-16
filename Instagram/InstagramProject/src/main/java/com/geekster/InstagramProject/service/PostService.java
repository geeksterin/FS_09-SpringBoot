package com.geekster.InstagramProject.service;

import com.geekster.InstagramProject.model.Post;
import com.geekster.InstagramProject.model.User;
import com.geekster.InstagramProject.repo.IPostRepo;
import com.geekster.InstagramProject.repo.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    @Autowired
    ITokenRepo tokenRepo;
    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> getAllPosts(String token) {
        User user = tokenRepo.findFirstByToken(token).getUser();


        List<Post> postList = postRepo.findByUser(user);

        return postList;


    }
}
