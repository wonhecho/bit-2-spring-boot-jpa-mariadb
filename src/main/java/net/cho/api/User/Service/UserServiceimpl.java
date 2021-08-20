package net.cho.api.User.Service;

import lombok.RequiredArgsConstructor;
import net.cho.api.User.Domain.User;
import net.cho.api.User.Repository.UserRepository;
import net.cho.api.order.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class UserServiceimpl implements UserService {
    private final UserRepository userrepository;
    @Override
    public List<User> findAll() {
        return userrepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userrepository.getById(id);
    }

    @Override
    public void save(User user) {
        userrepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userrepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return userrepository.existsById(id);
    }

    @Override
    public long count() {
        return userrepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userrepository.deleteById(id);
    }
}
