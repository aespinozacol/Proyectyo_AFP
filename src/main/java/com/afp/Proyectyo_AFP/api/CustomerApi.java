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
        log.info("Aqui retorna la lista de clientes");
        return ResponseEntity.ok(customerService.findAll());
    }

    @PostMapping //Post
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        Customer response = customerService.create(customer);
        return new ResponseEntity<Customer>(response, HttpStatus.CREATED);
    }

    @PutMapping //Post
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        Customer response = customerService.update(customer);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") long id){
        return ResponseEntity.ok(customerService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") long id){
        customerService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
