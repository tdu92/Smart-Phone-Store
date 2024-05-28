package com.codegym.smartphonestore.repository;

import com.codegym.smartphonestore.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Long> {
}
