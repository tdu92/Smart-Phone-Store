package com.codegym.smartphonestore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderDetail {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idOrderDetail;
    private int quantity;
    private String status;
    @ManyToOne private Order idOrder;
    @ManyToOne private Product idProduct;
}
