package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Employee;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddressRepositoryImpl implements AddressRepository {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Address save(Address address) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id =(Long)session.save(address);
        session.getTransaction().commit();
        Address result = session.get(Address.class,id);
        return address;
    }
}
