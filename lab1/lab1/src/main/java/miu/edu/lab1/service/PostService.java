package miu.edu.lab1.service;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;

import java.util.List;

public interface PostService {
    public List<Post> findAll();

    public PostDto findById(long id);

    public void save(Post p);

    void delete(int id);

    void update(long id, PostDto p);

}
