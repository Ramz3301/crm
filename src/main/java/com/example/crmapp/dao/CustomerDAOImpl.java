package com.example.crmapp.dao;

import com.example.crmapp.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    // need to inject session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        // get the current hibernate session
        Session session = sessionFactory.openSession();

        // create a query
        Query<Customer> query =
//                session.createQuery("FROM Customer", Customer.class);
                session.createQuery("FROM Customer");

        // execute query and get result list
        List<Customer> customers = query.getResultList();

        // return the results
        return customers;
    }

}
