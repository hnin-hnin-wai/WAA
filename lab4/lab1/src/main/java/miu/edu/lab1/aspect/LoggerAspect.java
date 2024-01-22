package miu.edu.lab1.aspect;


import miu.edu.lab1.entity.ExceptionLogger;
import miu.edu.lab1.entity.Logger;
import miu.edu.lab1.service.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Aspect
@Component
public class LoggerAspect {

    @Autowired
    LoggerService loggerService;

    @Pointcut("@annotation(miu.edu.lab1.aspect.annotation.LogMe))")
    public void LogMeAnnotation(){}

    @Pointcut("execution(* miu.edu.lab1.controller.UserController.*(..))")
    public void logMe(){}

    @AfterReturning("logMe()")
    public void logAfterReturning(JoinPoint joinPoint) {
       //System.out.println("Log after returned the method: " + joinPoint.getSignature().getName());
        Logger log = new Logger(LocalDate.now(), LocalTime.now(),"admin",joinPoint.getSignature().getName());
        loggerService.saveLogger(log);
    }

    @AfterThrowing("logMe()")
    public void logAfterThrowing(JoinPoint joinPoint) {
        //System.out.println("Log after throwing the method: " + joinPoint.getSignature().getName());
        //UBiDiProps exception;
        //ExceptionLogger el=new ExceptionLogger(LocalDate.now(), LocalTime.now(),"admin",joinPoint.getSignature().getName(),exception.getClass().getName());
    }
}
