package rpa0108.spring_template.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rpa0108.spring_template.entity.User;
import rpa0108.spring_template.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(User user) {
        this.userRepository.save(user);
    }

    public Optional<User> findById(String id) {
        return this.userRepository.findById(id);
    }

}
