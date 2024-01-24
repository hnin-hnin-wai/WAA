package miu.edu.lab1.service.Impl;

import lombok.RequiredArgsConstructor;
import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.dto.PostDto;
import miu.edu.lab1.helper.ListMapper;
import miu.edu.lab1.repo.PostRepo;
import miu.edu.lab1.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

   @Autowired
   PostRepo postRepo;
   @Autowired
   ListMapper listMapper;

   @Autowired
    ModelMapper modelMapper;
    @Override
    public List<PostDto> findAll() {

        //return postRepo.findAll();
        return (List<PostDto>) listMapper.mapList(postRepo.findAll(),new PostDto());}

    public PostDto findById(long id){
//        var post = postRepo.getById(id);
//
//        PostDto postDto=new PostDto();
//        postDto.setId(post.getId());
//        postDto.setTitle(post.getTitle());
//        postDto.setAuthor(post.getAuthor());
//        return postDto;
      // return  modelmapper.map(productRepo.getById(id),ProductDto.class);
        return modelMapper.map(postRepo.getById(id), PostDto.class);
    }

    @Override
    public void save(PostDto p) {
        //postRepo.save(p);
        //productRepo.save(modelMapper.map(p, Product.class));
        postRepo.save(modelMapper.map(p,Post.class));
    }

    @Override
    public List<Post> searchPostByTitle(String title) {
        List<Post> posts= postRepo.findAll();
        List<Post> resPosts=new ArrayList<>();
        for (Post p : posts) {
            if (p.getTitle().contains(title)) {
                resPosts.add(p);
            }
        }
        return resPosts;
    }

}

