package ua.com.tkachenko.hibernateexp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ua.com.tkachenko.hibernateexp.model.Tank;

public interface TankRepository extends CrudRepository<Tank, Integer> {

//    @Query(value = "INSERT INTO Tank (id, name) VALUES (?1, ?2)", nativeQuery = true)
//    void saveTank(Integer id, String name);
//
//    @Query(value = "SELECT id, name FROM Tank WHERE id = ?1", nativeQuery = true)
//    Tank getTank(Integer id);
//
//    @Query(value = "UPDATE Tank SET name = ?2 WHERE id = ?1", nativeQuery = true)
//    void updateTank(Integer id, String name);
}
