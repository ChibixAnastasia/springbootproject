package repository;

import model.Biseness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<Biseness, Long> {

}
