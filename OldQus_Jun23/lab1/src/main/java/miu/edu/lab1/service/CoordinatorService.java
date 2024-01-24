package miu.edu.lab1.service;

import miu.edu.lab1.entity.Coordinator;

import java.util.List;

public interface CoordinatorService {

    public List<Coordinator> findAll();

    public Coordinator findbyId(long id);

    public void deleteById(long id);

    public void save(Coordinator c);

    public void update(long id,Coordinator c);


}
