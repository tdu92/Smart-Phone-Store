package com.codegym.smartphonestore.repository;

import com.codegym.phonestoremanager.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
