package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.Admin;
import com.geekster.InstagramProject.model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<InstagramComment, Long> {
}
