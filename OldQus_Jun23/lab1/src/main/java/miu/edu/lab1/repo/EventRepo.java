package miu.edu.lab1.repo;

import miu.edu.lab1.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event,Long> {
}
