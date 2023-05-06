package com.geekster.studentcourse.repositories;

import com.geekster.studentcourse.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICourseRepo extends JpaRepository<Course,Long> {
}
