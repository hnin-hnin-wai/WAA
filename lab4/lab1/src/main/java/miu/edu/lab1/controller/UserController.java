package miu.edu.lab1.controller;

import miu.edu.lab1.aspect.annotation.ExecutionTime;
import miu.edu.lab1.aspect.annotation.LogMe;
import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.User;
import miu.edu.lab1.entity.dto.PostDto;
import miu.edu.lab1.entity.dto.response.ReqUser;
import miu.edu.lab1.service.PostService;
import miu.edu.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @LogMe
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @LogMe
    @GetMapping("/{id}")
    @ExecutionTime
    public User findById(@PathVariable("id") long id){
        return userService.findById(id);
    }


    @LogMe
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody User u) {
        userService.save(u);
    }

    @LogMe
    @GetMapping("/{id}/posts")
    public List<Post> findPostByUserId(@PathVariable("id") long id){
        return userService.findPostByUserId(id);
    }

    @LogMe
    @GetMapping("/moreposts/{count}")
    public List<User> findUserMoreThan1Post(@PathVariable("count") int count){
        return userService.findUserMoreThan1Post(count);
    }

    @LogMe
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping
    public void delete(@RequestBody ReqUser u){
        userService.deleteUser(u);
   }

}


