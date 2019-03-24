package ru.easyjava.spring.data.jpa.dal;

import org.springframework.data.repository.CrudRepository;
import ru.easyjava.spring.data.jpa.entity.Person;

import java.util.Collection;

/**
 * Repository for person entity.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    /**
     * Returns list of persons filtered by name
     * @param name value of name filter.
     * @return list of matching persons.
     */

    Collection<Person> findByFirstName(String name);
}
