package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    //setup to work once customer repos is made
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //add/update a customer (save operation)
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //fetch all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    //fetch a single customer by ID
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    //delete a customer by ID
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
