package miu.edu.lab1.repo;

import miu.edu.lab1.entity.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo extends JpaRepository<Logger,Long> {
}
