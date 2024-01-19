package miu.edu.lab1.controller;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.User;
import miu.edu.lab1.entity.dto.PostDto;
import miu.edu.lab1.service.PostService;
import miu.edu.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") long id){
        return userService.findById(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody User u) {
        userService.save(u);
    }

    @GetMapping("/{id}/posts")
    public List<Post> findPostByUserId(@PathVariable("id") long id){
        return userService.findPostByUserId(id);
    }

}
