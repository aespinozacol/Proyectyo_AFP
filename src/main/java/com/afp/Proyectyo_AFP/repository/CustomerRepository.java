package com.afp.Proyectyo_AFP.repository;

import com.afp.Proyectyo_AFP.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //Por Spring Data Rest. Crea API REST
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
