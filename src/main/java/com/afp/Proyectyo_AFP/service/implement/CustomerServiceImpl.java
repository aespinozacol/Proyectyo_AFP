package com.afp.Proyectyo_AFP.service.implement;

import com.afp.Proyectyo_AFP.model.AFP;
import com.afp.Proyectyo_AFP.model.Customer;
import com.afp.Proyectyo_AFP.repository.AFPRepository;
import com.afp.Proyectyo_AFP.repository.CustomerRepository;
import com.afp.Proyectyo_AFP.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(long id) {
        Optional<Customer> op = customerRepository.findById(id);
        return op.isPresent() ? op.get() : new Customer();
    }

    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);
    }
}
