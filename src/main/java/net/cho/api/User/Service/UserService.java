package net.cho.api.User.Service;

import net.cho.api.User.Domain.User;
import net.cho.api.User.Domain.UserDto;
import net.cho.api.security.exception.SecurityRuntimeException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    List<User> findAll();
    void save(User user);
    Optional<User> findById(Long id);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
    String signup(User user) throws SecurityRuntimeException;
    UserDto signin(User user) throws SecurityRuntimeException;
}

