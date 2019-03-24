package ua.com.tkachenko.simple.dao;

import org.springframework.data.repository.CrudRepository;
import ua.com.tkachenko.simple.model.Skill;

public interface SkillDao extends CrudRepository<Skill, Integer> {
    Skill findByName(String name);
}
