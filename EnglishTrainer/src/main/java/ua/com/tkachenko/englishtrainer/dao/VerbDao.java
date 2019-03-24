package ua.com.tkachenko.englishtrainer.dao;

import org.springframework.data.repository.CrudRepository;
import ua.com.tkachenko.englishtrainer.model.Verb;

public interface VerbDao extends CrudRepository<Verb, Integer> {
}
