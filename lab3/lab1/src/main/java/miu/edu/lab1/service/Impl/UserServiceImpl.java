package miu.edu.lab1.service.Impl;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.User;
import miu.edu.lab1.entity.dto.response.ReqUser;
import miu.edu.lab1.helper.ListMapper;
import miu.edu.lab1.repo.PostRepo;
import miu.edu.lab1.repo.UserRepo;
import miu.edu.lab1.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ListMapper listMapper;
    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(long id) {
      return  modelMapper.map(userRepo.findById(id).get(),User.class);
    }

    @Override
    public void save(User u) {
        userRepo.save(modelMapper.map(u, User.class));
    }

    @Override
    public List<Post> findPostByUserId(long id) {
       User u= userRepo.findById(id).get();
      List<Post> posts= listMapper.mapList(u.getPosts(),new Post());
        return posts;
    }

    @Override
    public List<User> findUserMoreThan1Post(int count) {
       List<User> users=userRepo.findAll();
       List<User> resUser=new ArrayList<>();

        for (User u : users) {
            if (u.getPosts().size() > count) {
                resUser.add(u);
            }
        }
        return resUser;
    }

    @Override
    public void deleteUser(ReqUser u) {
        userRepo.delete(userRepo.findById(u.getId()).get());
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

