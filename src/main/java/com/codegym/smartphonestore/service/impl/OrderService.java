package com.codegym.smartphonestore.service.impl;

import com.codegym.phonestoremanager.model.Order;
import com.codegym.phonestoremanager.repository.OrderRepository;
import com.codegym.phonestoremanager.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
        return order.get(); }
        else return null;

    }
    public void save(Order order) {
        orderRepository.save(order);
    }
    public void remove(Long id) {
        Order order = orderRepository.findById(id).get();
        order.setStatus("DELETED");
        orderRepository.save(order);
    }

}
