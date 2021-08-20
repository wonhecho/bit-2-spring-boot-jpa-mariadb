package net.cho.api.Item.service;

import lombok.RequiredArgsConstructor;
import net.cho.api.Item.domain.Item;
import net.cho.api.Item.repository.Itemrepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class ItemServiceimpl implements ItemService {

    private final Itemrepository itemrepository;
    @Override
    public List<Item> findAll() {
        return itemrepository.findAll();
    }

    @Override
    public void save(Item item) {
        itemrepository.save(item);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemrepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return itemrepository.existsById(id);
    }

    @Override
    public long count() {
        return itemrepository.count();
    }

    @Override
    public void deleteById(Long id) {
        itemrepository.deleteById(id);
    }
}
