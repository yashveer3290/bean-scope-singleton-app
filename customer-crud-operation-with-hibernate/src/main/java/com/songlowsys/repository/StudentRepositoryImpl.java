package com.songlowsys.repository;

import com.songlowsys.domain.Student;
import com.songlowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.OneToOne;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {


    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Student save(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(student);
        session.getTransaction().commit();
        Student result = session.get(Student.class, id);
        return result;
    }

    @Override
    public Student update(Student student, Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student result = session.get(Student.class,id);
        result.setFirstName(student.getFirstName());
        session.update(result);
        session.getTransaction().commit();
        session.close();
        System.out.println("updated--");
        return null;
    }

    @Override
    public List<Student> findALL() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query =  session.createQuery("from Student");
        List<Student> studentList = query.list();
        session.close();
        return studentList;
    }
    
    @Override
    public Student findById(Long id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class,id);

        return student;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("delete");

    }
}
