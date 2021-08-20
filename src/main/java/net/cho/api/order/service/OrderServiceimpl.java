package net.cho.api.order.service;

import lombok.RequiredArgsConstructor;
import net.cho.api.Item.repository.Itemrepository;
import net.cho.api.order.Domain.Order;
import net.cho.api.order.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class OrderServiceimpl implements OrderService {
    private final OrderRepository orderrepository;
    @Override
    public List<Order> findAll() {
        return orderrepository.findAll();
    }

    @Override
    public Order getById(Long id) {
        return orderrepository.getById(id);
    }

    @Override
    public void save(Order order) {
        orderrepository.save(order);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return orderrepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return orderrepository.existsById(id);
    }

    @Override
    public long count() {
        return orderrepository.count();
    }

    @Override
    public void deleteById(Long id) {
        orderrepository.deleteById(id);
    }
}
