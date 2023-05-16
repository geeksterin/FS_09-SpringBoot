package com.geekster.InstagramProject.controller;


import com.geekster.InstagramProject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;
}
