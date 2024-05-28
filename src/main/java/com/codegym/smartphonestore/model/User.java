package com.codegym.smartphonestore.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class User {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUser;
    private String userName;
    private String password;
    private String displayName;
    @ManyToOne
    private Role role;
}
