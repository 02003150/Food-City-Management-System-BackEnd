package org.example.controller;

import org.example.dto.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService service;
    @PostMapping("/add-customer")
    public void addCustomers(@RequestBody Customer customer){
    service.addCustomer(customer);
    }
    @GetMapping("/get-customer")
    public List<Customer> getCustomer(){
       return service.getCustomer();
    }
    @GetMapping("search-customer/{id}")
    public List<Customer> searchCustomerById(@PathVariable Integer id){
       return service.searchById(id);
    }
}
