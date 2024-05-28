package com.codegym.smartphonestore.repository;

import com.codegym.smartphonestore.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long> {
}
