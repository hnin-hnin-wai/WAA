package miu.edu.lab1.service.Impl;

import miu.edu.lab1.entity.Logger;
import miu.edu.lab1.repo.LoggerRepo;
import miu.edu.lab1.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    LoggerRepo loggerRepo;
    @Override
    public void saveLog(Logger l) {
        loggerRepo.save(l);
    }
}
