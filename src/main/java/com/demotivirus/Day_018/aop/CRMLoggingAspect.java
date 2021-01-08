package com.demotivirus.Day_018.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut(value = "execution(* com.demotivirus.Day_018.controller.*.*(..))")
    private void pointcutForControllers(){}

    @Pointcut(value = "execution(* com.demotivirus.Day_018.controller.*.*(..))")
    private void pointcutForServices(){}

    @Pointcut(value = "execution(* com.demotivirus.Day_018.controller.*.*(..))")
    private void pointcutForRepositories(){}

    @Pointcut("pointcutForControllers() || pointcutForRepositories() || pointcutForServices()")
    private void pointcutForControllerServiceRepository(){}

    @Before("pointcutForRepositories()")
    public void beforeForControllerRepositoryServices(JoinPoint joinPoint){
        String meth = joinPoint.getSignature().toShortString();
        logger.info("DAO @Before calling meth " + meth);
    }

    @AfterReturning(
            pointcut = "pointcutForControllerServiceRepository()",
            returning = "res"
    )
    public void afterReturning(JoinPoint joinPoint, Object res){
        String meth = joinPoint.getSignature().toShortString();
        logger.info("@AfterReturning calling meth " + meth);
        logger.info("RESULT: " + res);
    }
}
