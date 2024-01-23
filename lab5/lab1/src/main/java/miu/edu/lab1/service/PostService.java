package miu.edu.lab1.service;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;
import java.util.List;

public interface PostService {
    public List<PostDto> findAll();

    public PostDto findById(long id);

    public void save(PostDto p);

    public List<Post> searchPostByTitle(String title);


}
