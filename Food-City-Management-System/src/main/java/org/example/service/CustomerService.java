package org.example.service;

import org.example.dto.Customer;
import org.example.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    CustomerEntity addCustomer(Customer customer);

    List<Customer> getCustomer();

    List searchById(Integer id);
}
