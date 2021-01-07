package com.demotivirus.Day_017;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {
    @Before("execution(public void addAccount())")
    public void testSimpleAopAdvice(){
        System.out.println("Executing @Before advice on addAccount()");
    }

    @After("execution(public void add*())")
    public void testAdviceForAllAddMethods(){
        System.out.println("===========> Executing @After advice on any add meth");
    }

    @Before("execution(public void com.demotivirus.Day_017.AccountDao.addAccount())")
    public void testAdviceOnlyForAccountDaoAddAccountMeth(){
        System.out.println("BEFORE ONLY AccountDao ADD METH");
    }

    @After("execution(* getAccount())")
    public void testAdviceForReturnType(){
        System.out.println("===========> After RETURN METH");
    }

    @Before("execution(public void add*(com.demotivirus.Day_017.Account))")
    public void testAdviceForMethodParameters(){
        System.out.println("ADVICE FOR METHOD PARAMETERS");
    }

    @After("execution(* add*(com.demotivirus.Day_017.Account, ..))")
    public void testAdviceForAnyMethParam(){
        System.out.println("ADVICE FOR ANY METHOD PARAM");
    }

    //* - void/return com.demotivirus.Day_017.* - any class.* - any method(.. - any parameters)
    @Before("execution(* com.demotivirus.Day_017.*.*(..))")
    public void testAdviceForAnyCallsInPackage(){
        System.out.println("LOG ANY CALLS IN PACKAGE");
    }
}
