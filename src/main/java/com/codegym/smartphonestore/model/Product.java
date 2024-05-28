package com.codegym.smartphonestore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Product {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProduct;
    private String productName;
    private double price;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Customer customer;

}
