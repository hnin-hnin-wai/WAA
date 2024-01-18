package miu.edu.lab1.controller;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;
import miu.edu.lab1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
   @Autowired
   PostService postService;
    @GetMapping
    public List<Post> findAll(){
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDto findById(@PathVariable("id") long id){
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        postService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody PostDto p) {
        postService.update(id,p);
    }

}
