package gorzdnakan.demo.model.repository;

import gorzdnakan.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Integer> {
}
