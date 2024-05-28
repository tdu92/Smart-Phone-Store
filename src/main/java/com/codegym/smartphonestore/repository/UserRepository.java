package com.codegym.smartphonestore.repository;

import com.codegym.phonestoremanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
