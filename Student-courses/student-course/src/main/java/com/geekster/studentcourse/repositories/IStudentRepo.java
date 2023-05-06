package com.geekster.studentcourse.repositories;

import com.geekster.studentcourse.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


//@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {


   /* @Query(value = "select STUDENT_table.*\n" +
            "from STUDENT_table\n" +
            "inner join \n" +
            "course_table\n" +
            "on \n" +
            "STUDENT_table.student_id = course_table.fk_student_student_id\n" +
            "where course_table.course_id = :id",nativeQuery = true)*/
   @Query(value = "select STUDENT_table.*\n" +
           "from STUDENT_table\n" +
           "inner join \n" +
           "course_table\n" +
           "on \n" +
           "STUDENT_table.fk_course_course_id = course_table.course_id\n" +
           "where course_table.course_id = :id",nativeQuery = true)
    List<Student> getStudentByCourseID(Long id);


}
