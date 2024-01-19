package miu.edu.lab1.service.Impl;

import miu.edu.lab1.entity.Post;
import miu.edu.lab1.entity.User;
import miu.edu.lab1.helper.ListMapper;
import miu.edu.lab1.repo.UserRepo;
import miu.edu.lab1.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    UserRepo userRepo;

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


}
