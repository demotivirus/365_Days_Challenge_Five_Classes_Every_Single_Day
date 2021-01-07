package com.demotivirus.Day_017_S2.aspectJoinPoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExpression {
    @Pointcut("execution(* com.demotivirus.Day_017_S2.*.*(..))")
    public void forAll(){}
}
