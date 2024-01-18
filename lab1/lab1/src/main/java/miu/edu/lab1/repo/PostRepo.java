package miu.edu.lab1.repo;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;

import java.util.List;


public interface PostRepo {

    public List<Post> findAll();

    public Post getById(long id);

    public void save(Post p);

    public void delete(int id);

    public void update(long id, PostDto p);


}
