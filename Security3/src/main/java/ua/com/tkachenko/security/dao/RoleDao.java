package ua.com.tkachenko.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.tkachenko.security.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
