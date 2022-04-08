package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    @Override
    public Employee save(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id =(Long)session.save(employee);
        session.getTransaction().commit();
        Employee result = session.get(Employee.class,id);
        return result;

    }

    @Override
    public Employee update(Employee employee, Long id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {

        return null;
    }

    @Override
    public Employee findById(Long id) {
            return null;
    }

    @Override
    public void delete(Long id) {

    }
}
