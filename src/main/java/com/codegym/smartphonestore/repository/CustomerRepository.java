package com.codegym.smartphonestore.repository;

import com.codegym.smartphonestore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
