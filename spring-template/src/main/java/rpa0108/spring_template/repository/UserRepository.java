package rpa0108.spring_template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rpa0108.spring_template.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(String username);

}
