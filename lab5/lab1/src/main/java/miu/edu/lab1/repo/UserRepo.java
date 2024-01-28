package miu.edu.lab1.repo;

import miu.edu.lab1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Long> {
    @Query("select distinct " +
            "u from User u join Post p where p.title=:title")
    public List<User> searchUserByTitle(String title);

    User findByEmail(String email);
}
