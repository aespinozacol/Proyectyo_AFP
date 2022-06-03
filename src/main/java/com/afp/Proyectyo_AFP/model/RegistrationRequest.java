package com.afp.Proyectyo_AFP.model;

import lombok.Data;

import javax.persistence.*;

@Data //Lombok
@Entity //JPA
@Table(name = "RegistrationRequest") //JPA
public class RegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "id_customer", nullable = false)
    private Integer id_customer;

    @Column(name = "withdrawal_amount", nullable = false)
    private Double withdrawal_amount;

    @Column(name = "id_afp", nullable = false)
    private Integer id_afp;
}
