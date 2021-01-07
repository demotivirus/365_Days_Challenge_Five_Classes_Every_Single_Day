package com.demotivirus.Day_017_S2.aspectAround;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AspectAround {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Around("execution(* com.demotivirus.Day_017_S2.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        String meth = proceedingJoinPoint.getSignature().toShortString();
        logger.info("@AfterReturning " + meth);

        long begin = System.currentTimeMillis();

        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception ex){
            logger.warning(ex.getMessage());
            result = "SAFE RESULT ON @Around aroundGetFortune()";
        }

        long end = System.currentTimeMillis();
        long duration = end - begin;
        logger.info("DURATION IN @Around: " + duration / 1000.0 + " seconds");
        return result;
    }
}
