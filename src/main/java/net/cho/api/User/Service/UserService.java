package net.cho.api.User.Service;

import net.cho.api.User.Domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    List<User> findAll();
    User getById(Long id);
    void save(User user);
    Optional<User> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
}

