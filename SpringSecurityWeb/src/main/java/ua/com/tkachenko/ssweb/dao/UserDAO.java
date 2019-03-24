package ua.com.tkachenko.ssweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.tkachenko.ssweb.model.User;

public interface UserDAO extends JpaRepository<User, Long>{
}
