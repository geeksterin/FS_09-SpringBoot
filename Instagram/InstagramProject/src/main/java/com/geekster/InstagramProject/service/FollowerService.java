package com.geekster.InstagramProject.service;


import com.geekster.InstagramProject.model.InstagramFollower;
import com.geekster.InstagramProject.model.User;
import com.geekster.InstagramProject.repo.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {

    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
