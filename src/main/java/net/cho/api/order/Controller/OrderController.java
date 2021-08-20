package net.cho.api.order.Controller;

import net.cho.api.User.Domain.User;
import net.cho.api.order.Domain.Order;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public List<Order> findAll() {
        return null;
    }

    //    @Override
//    public User getById(Long id) {
//        return null;
//    }
    @PutMapping
    public void update (Order order){

    }

    @PostMapping
    public void save(Order order) {

    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable Long id) {
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
