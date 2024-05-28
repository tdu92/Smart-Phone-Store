package com.codegym.smartphonestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCustomer;
    private String customerName;
    private String customerPhone;

}
