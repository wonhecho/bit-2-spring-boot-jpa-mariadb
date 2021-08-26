package net.cho.api.security.domain;

import lombok.RequiredArgsConstructor;
import net.cho.api.User.Domain.User;
import net.cho.api.User.Repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.nio.file.OpenOption;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class userDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(userRepository.findByUsername(username))
                .orElseThrow(()->new UsernameNotFoundException("User Not Found with username : "+ username));
        return UserDetailsImpl.build(user.get());
    }
}
