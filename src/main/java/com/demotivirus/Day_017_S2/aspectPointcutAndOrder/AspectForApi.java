package com.demotivirus.Day_017_S2.aspectPointcutAndOrder;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//THIS IS 3
@Order(6)
public class AspectForApi {
    @Before("com.demotivirus.Day_017_S2.aspectPointcutAndOrder.AopExpressions.getters()")
    public void aspectForGetters(){
        System.out.println("ONLY GETTERS in " + getClass());
    }
}
