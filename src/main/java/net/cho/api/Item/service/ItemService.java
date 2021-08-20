package net.cho.api.Item.service;

import net.cho.api.Item.domain.Item;
import net.cho.api.User.Domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    void save(Item item);
    Optional<Item> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}
