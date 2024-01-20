package miu.edu.lab1.service;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.User;
import miu.edu.lab1.entity.dto.PostDto;
import miu.edu.lab1.entity.dto.response.ReqUser;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User findById(long id);

    public void save(User u);

    public List<Post> findPostByUserId(long id);

    public  List<User> findUserMoreThan1Post(int count);

    public void deleteUser(ReqUser u);

    public List<User> searchUserByTitle(String title);

}