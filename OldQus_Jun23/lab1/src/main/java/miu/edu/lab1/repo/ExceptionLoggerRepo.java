package miu.edu.lab1.repo;

import miu.edu.lab1.entity.ExceptionLogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionLoggerRepo extends JpaRepository<ExceptionLogger,Long> {
}
