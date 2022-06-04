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
    @Column(name = "withdrawal_amount", nullable = false)
    private Double withdrawal_amount;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "Customer", referencedColumnName = "id")
    private Customer customer;

}
