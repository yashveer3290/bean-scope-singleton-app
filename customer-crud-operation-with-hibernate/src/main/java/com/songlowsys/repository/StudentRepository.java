package com.songlowsys.repository;

import com.songlowsys.domain.Student;

import java.util.List;

public interface StudentRepository {

    Student save(Student student);

    Student update(Student student,Long id);

    List<Student> findALL();

    Student findById(Long id);

    void delete(Long id);

}
