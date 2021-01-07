package com.demotivirus.Day_017_S2.aspectPointcutAndOrder;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//THIS IS SECOND
@Order(5)
public class AspectForLogging {
    @Before("com.demotivirus.Day_017_S2.aspectPointcutAndOrder.AopExpressions.testAspectForReUsable()")
    public void testAspectPointcut(){
        System.out.println("REUSABLE ASPECT in " + getClass());
    }
}
