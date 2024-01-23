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
    public List<PostDto> findAll(){
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public PostDto findById(@PathVariable("id") long id){
        return postService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody PostDto p) {
        postService.save(p);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/byPostTitle")
    public List<Post> searchUserByTitle(@RequestParam("postByTitle") String title){
/*    @GetMapping("/byPostTitle/{title}")
    public List<Post> searchPostByTitle(@PathVariable("title") String title){*/
        return postService.searchPostByTitle(title);
    }
}
