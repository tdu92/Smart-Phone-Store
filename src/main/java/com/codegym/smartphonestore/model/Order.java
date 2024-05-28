package com.codegym.smartphonestore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;
    private Timestamp time;
    private double total;
    private String status;
    @ManyToOne
    private Customer customer;
}
