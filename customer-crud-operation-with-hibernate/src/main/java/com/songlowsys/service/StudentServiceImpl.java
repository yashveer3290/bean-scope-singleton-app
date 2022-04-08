package com.songlowsys.service;

import com.songlowsys.domain.Student;
import com.songlowsys.repository.StudentRepository;
import com.songlowsys.repository.StudentRepositoryImpl;

import javax.persistence.OneToOne;
import java.util.List;


public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public Student save(Student student, Long id) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student, Long id) {
        return null;
    }



    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
