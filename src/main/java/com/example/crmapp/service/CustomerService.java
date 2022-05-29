package com.example.crmapp.service;

import com.example.crmapp.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
}
