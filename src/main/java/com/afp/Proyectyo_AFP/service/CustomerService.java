package com.afp.Proyectyo_AFP.service;

import com.afp.Proyectyo_AFP.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer create(Customer customer);

    Customer update(Customer customer);

    Customer findById(long id);

    void delete(long id);
}
