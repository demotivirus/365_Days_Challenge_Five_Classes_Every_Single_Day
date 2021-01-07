package com.demotivirus.Day_017_S2.aspectPointcutAndOrder;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution(* com.demotivirus.Day_017_S2.*.add*(..))")
    public void testAspectForReUsable(){
        //this text suppresed
        System.out.println("REUSABLE ASPECT");
    }

    @Pointcut("execution(* com.demotivirus.Day_017_S2.*.get*(..))")
    public void getters(){}

    @Pointcut("execution(* com.demotivirus.Day_017_S2.*.set*(..))")
    public void setters(){}

    @Pointcut("testAspectForReUsable() && !(getters() || setters())")
    public void forDaoNotGettersAndSetters(){}
}
