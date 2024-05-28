package com.codegym.smartphonestore.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
public class User {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String password;
    private String displayName;
    @ManyToOne
    private Role role;
}
