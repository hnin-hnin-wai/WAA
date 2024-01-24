package miu.edu.lab1.service.Impl;

import miu.edu.lab1.entity.Coordinator;
import miu.edu.lab1.entity.User;
import miu.edu.lab1.helper.ListMapper;
import miu.edu.lab1.repo.CoordinatorRepo;
import miu.edu.lab1.service.CoordinatorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CoordinatorServiceImpl implements CoordinatorService {

    @Autowired
    CoordinatorRepo coordinatorRepo;

    @Autowired
    ListMapper listMapper;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<Coordinator> findAll() {
        return coordinatorRepo.findAll();
    }

    @Override
    public Coordinator findbyId(long id) {
        return modelMapper.map(coordinatorRepo.findById(id).get(),Coordinator.class);
    }

    @Override
    public void deleteById(long id) {
        coordinatorRepo.deleteById(id);
    }

    @Override
    public void save(Coordinator c) {
       coordinatorRepo.save(modelMapper.map(c,Coordinator.class));
    }

    @Override
    public void update(long id,Coordinator c) {
       // coordinatorRepo.update
       // coordinatorRepo
    }
}
