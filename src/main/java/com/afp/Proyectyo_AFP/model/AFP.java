package com.afp.Proyectyo_AFP.model;

import lombok.Data;

import javax.persistence.*;

@Entity //JPA
@Data //Lombok --Esto al momento de compilar le va a agregar su SET y GET
@Table(name = "afp") //JPA
public class AFP { //JPA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 70)
    private String name;
}
