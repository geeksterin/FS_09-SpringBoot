package com.geekster.InstagramProject.service;

import com.geekster.InstagramProject.model.InstagramFollowing;
import com.geekster.InstagramProject.model.User;
import com.geekster.InstagramProject.repo.IFollowerRepo;
import com.geekster.InstagramProject.repo.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {

    @Autowired
    IFollowingRepo followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}
