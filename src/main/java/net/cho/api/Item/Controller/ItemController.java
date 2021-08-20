package net.cho.api.Item.Controller;

import net.cho.api.Item.domain.Item;
import net.cho.api.User.Domain.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {
    @GetMapping
    public List<Item> findAll() {
        return null;
    }

    //    @Override
//    public User getById(Long id) {
//        return null;
//    }
    @PutMapping
    public void update (Item item){

    }

    @PostMapping
    public void save(Item item) {

    }

    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable Long id) {
        return Optional.empty();
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable Long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping
    public void deleteById(Long id) {

    }
}
