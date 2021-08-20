package net.cho.api.order.service;

import net.cho.api.Item.domain.Item;
import net.cho.api.order.Domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface OrderService {
    List<Order> findAll();
    Order getById(Long id);
    void save(Order order);
    Optional<Order> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
