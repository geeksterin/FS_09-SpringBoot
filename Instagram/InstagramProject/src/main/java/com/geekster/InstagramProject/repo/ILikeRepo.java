package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.InstagramComment;
import com.geekster.InstagramProject.model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepo extends JpaRepository<PostLike, Long> {
    long countByPost_PostId(Long postId);
}
