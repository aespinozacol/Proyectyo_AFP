package com.afp.Proyectyo_AFP.api;

import com.afp.Proyectyo_AFP.model.Customer;
import com.afp.Proyectyo_AFP.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Para expóner apirest
@RequestMapping(value = "customers") //Define recursos al cual esta relacionado el api
@Slf4j
public class CustomerApi {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){
        log.info("list all customers");
        return ResponseEntity.ok(customerService.findAll());
    }

    @PostMapping //Post
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        Customer response = customerService.create(customer);
        log.info("Create one Customer");
        return new ResponseEntity<Customer>(response, HttpStatus.CREATED);
    }

    @PutMapping //Post
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        Customer response = customerService.update(customer);
        log.info("Update one Customer");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") long id){
        log.info("Search for one Customer by id");
        return ResponseEntity.ok(customerService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        customerService.delete(id);
        log.info("Delete one Customer");
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
