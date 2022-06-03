package com.afp.Proyectyo_AFP.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data //Lombok
@Entity //JPA
@Table(name = "AFP_Association") //JPA //Da nombre a la tabla
public class AFPAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "amount_available", nullable = false)
    private Double amount_available;

    @Column(name = "account_number", nullable = false, length = 30)
    private String account_number;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "withdrawal_date", nullable = false)
    private Date withdrawal_date;
}
