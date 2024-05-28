package com.codegym.smartphonestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;


@Entity @Data
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Timestamp time;
    private double total;
    private String customerName;
    private String customerPhone;
}