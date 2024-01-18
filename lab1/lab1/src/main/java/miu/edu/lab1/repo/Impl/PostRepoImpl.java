package miu.edu.lab1.repo.Impl;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;
import miu.edu.lab1.repo.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostRepoImpl implements PostRepo {

    private static  List<Post> posts;

    private static int postId=300;

    static{
        posts=new ArrayList<>();
        Post p1=new Post(100,"Book1","content1","author1");
        Post p2=new Post(101,"Book2","content2","author2");
        Post p3=new Post(103,"Book3","content3","author3");

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }
    @Override
    public List<Post> findAll() {
        return posts;
    }

    public Post getById(long id){
        return posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Post p) {
        p.setId(postId); // We are auto generating the id for DEMO purposes, (Normally, do not change your parameters)
        postId++;
        posts.add(p);
    }

    @Override
    public void delete(int id) {
        var post =posts
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst().get();
        posts.remove(post);
    }

    @Override
    public void update(long id, PostDto p) {

        Post toUpdate=getById(id);
        toUpdate.setTitle(p.getTitle());
        toUpdate.setAuthor(p.getAuthor());
    }
}



