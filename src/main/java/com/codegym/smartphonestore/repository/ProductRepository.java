package com.codegym.smartphonestore.repository;

import com.codegym.smartphonestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
