package miu.edu.lab1.repo;

import miu.edu.lab1.entity.Coordinator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinatorRepo extends JpaRepository<Coordinator,Long> {
}
