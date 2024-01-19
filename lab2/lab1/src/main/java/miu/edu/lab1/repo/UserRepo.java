package miu.edu.lab1.repo;

import miu.edu.lab1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
