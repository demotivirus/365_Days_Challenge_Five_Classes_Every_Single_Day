package com.demotivirus.Day_017_S2.aspectPointcutAndOrder;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//THIS IS FIRST
@Order(1)
public class AspectForCloud {
    @Before("com.demotivirus.Day_017_S2.aspectPointcutAndOrder.AopExpressions.forDaoNotGettersAndSetters()")
    public void testAspectForOrder(){
        System.out.println("ASPECT ONLY FOR CLOUD in " + getClass());
    }
}
