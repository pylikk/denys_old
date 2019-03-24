package ua.com.tkachenko.security.service;

import ua.com.tkachenko.security.model.User;

public interface UserService {
    void save (User user);
    User findByUsername(String username);
}
