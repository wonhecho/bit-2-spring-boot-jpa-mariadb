package net.cho.api.User.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.cho.api.User.Domain.Role;
import net.cho.api.User.Domain.User;
import net.cho.api.User.Domain.UserDto;
import net.cho.api.User.Repository.UserRepository;
import net.cho.api.order.Repository.OrderRepository;
import net.cho.api.security.domain.SecurityProvider;
import net.cho.api.security.exception.SecurityRuntimeException;
import net.cho.api.util.Proxy;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceimpl extends Proxy implements UserService {
    private final UserRepository userrepository;
    private final PasswordEncoder passwordEncoder;
    private final SecurityProvider provider;
    private final AuthenticationManager manager;
    private final ModelMapper modelMapper;
    @Override
    public List<User> findAll() {
        return userrepository.findAll();
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
    public String signup(User user) throws SecurityRuntimeException {
        if(!userrepository.existsByUsername(user.getUsername())){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);
            user.setRoles(list);
            userrepository.save(user);
            log.info("user" + user);
            return provider.createToken(user.getUsername(),user.getRoles());
        }else{
            throw new SecurityRuntimeException("중복된 ID 입니다", HttpStatus.UNPROCESSABLE_ENTITY);

        }

    }

    @Override
    public UserDto signin(User user) throws SecurityRuntimeException {
        try{
            UserDto userDto = modelMapper.map(user,UserDto.class);
            String token = (passwordEncoder.matches(user.getPassword(),
                    userrepository.findByUsername(user.getUsername()).get().getPassword()))
                    ? provider.createToken(user.getUsername(), userrepository.findByUsername(user.getUsername()).get().getRoles())
                    : "Wrong Password" ;
            userDto.setToken(token);
            return userDto;

        }catch (Exception e){
            throw new SecurityRuntimeException("유효하지 않은 아이디 / 비밀번호", HttpStatus.UNPROCESSABLE_ENTITY);

        }

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
