package miu.edu.lab1.service.Impl;

import miu.edu.lab1.entity.ExceptionLogger;
import miu.edu.lab1.repo.ExceptionLoggerRepo;
import miu.edu.lab1.service.ExceptionLoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionLoggerServiceImpl implements ExceptionLoggerService {

    @Autowired
    ExceptionLoggerRepo exceptionLoggerRepo;
    @Override
    public void saveExceptionLogger(ExceptionLogger el) {
        exceptionLoggerRepo.save(el);
    }
}
