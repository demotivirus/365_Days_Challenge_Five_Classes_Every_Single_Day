package com.demotivirus.Day_018_S2.main.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class SimplyLoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.demotivirus.Day_018_S2.*.*(..))")
    private void aspectForAllCalls(){}

    @Before("aspectForAllCalls()")
    public void simplyLogging(JoinPoint joinPoint){
        String meth = joinPoint.getSignature().toShortString();
        logger.info("@AfterReturning calling meth: " + meth);
    }
}
