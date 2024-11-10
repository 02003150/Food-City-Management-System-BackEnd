package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.entity.UserEntity;
import org.example.repository.CustomerRepository;
import org.example.service.CustomerService;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final ModelMapper mapper;

    @Autowired
    CustomerRepository repository;

    @Override
    public CustomerEntity addCustomer(Customer customer) {
        return repository.save(mapper.map(customer, CustomerEntity.class));
    }
    @Override
    public List<Customer> getCustomer() {
        List<Customer> customers=new ArrayList<>();
        repository.findAll().forEach(customerEntity -> {customers.add(mapper.map(customerEntity,Customer.class));
        });
        return customers;
    }

    @Override
    public List searchById(Integer id) {
        List<Customer> customers=new ArrayList<>();
        Optional<CustomerEntity> byId = repository.findById(id);
        customers.add(mapper.map(byId, Customer.class));
        return customers;
    }

}
