package miu.edu.lab1.repo;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepo extends JpaRepository<Post,Long> {

}
