package com.GAF.CRUD.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

//    @Query("SELECT s FROM student s WHERE s.email = ?1") jpql
    Optional <Student> findStudentByEmail(String email);
}
