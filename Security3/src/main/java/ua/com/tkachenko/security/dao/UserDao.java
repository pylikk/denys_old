package ua.com.tkachenko.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.tkachenko.security.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
