package ua.com.tkachenko.simple.dao;

import org.springframework.data.repository.CrudRepository;
import ua.com.tkachenko.simple.model.Developer;

public interface DeveloperDao extends CrudRepository<Developer, Integer> {
}
