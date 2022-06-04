package com.afp.Proyectyo_AFP.model;

import lombok.Data;

import javax.persistence.*;
@Data //Lombok
@Entity //JPA
@Table(name = "Customer") //JPA
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 70)
    private String name;

    @Column(name = "lastname", nullable = false, length = 70)
    private String lastname;

    @Column(name = "dni", nullable = false, length = 8, unique = true)
    private String dni;

    @Column(name = "phone", nullable = false)
    private Integer phone;

    @Column(name = "email", nullable = false, length = 70)
    private String email;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "afp", referencedColumnName = "id")
    //@Column(name = "id_afp", nullable = false)
    private AFP afp;


}
