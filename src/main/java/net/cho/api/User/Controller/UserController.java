package net.cho.api.User.Controller;

import net.cho.api.User.Domain.User;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<User> findAll() {
        return null;
    }

    @PutMapping
    public void update (User user){

    }

    @PostMapping
    public void save(User user) {

    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
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
