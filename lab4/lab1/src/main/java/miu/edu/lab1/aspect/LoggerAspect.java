package miu.edu.lab1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {


    @Pointcut("@annotation(miu.edu.lab1.aspect.annotation.LogMe))")
    public void LogMeAnnotation(){}

    @Pointcut("execution(* miu.edu.lab1.controller.UserController.*(..))")
    public void logMe(){}

    @AfterReturning("logMe()")
    public void logAfterReturning(JoinPoint joinPoint) {
       //System.out.println("Log after returned the method: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing("logMe()")
    public void logAfterThrowing(JoinPoint joinPoint) {
        //System.out.println("Log after throwing the method: " + joinPoint.getSignature().getName());
    }
}
