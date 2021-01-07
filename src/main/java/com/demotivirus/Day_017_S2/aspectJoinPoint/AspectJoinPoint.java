package com.demotivirus.Day_017_S2.aspectJoinPoint;

import com.demotivirus.Day_017_S2.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AspectJoinPoint {
    @AfterReturning(
            pointcut = "execution(* com.demotivirus.Day_017_S2.UserDao.findAllUsers())",
            returning = "result")
    public void afterReturningList(JoinPoint joinPoint, List<User> result){
        if(result.isEmpty())
            result.add(new User("aspectUser", "aspectPassword"));
        else{
            User modifyUser = result.get(0);
            modifyUser.setName("ModifyUser");
        }

        String meth = joinPoint.getSignature().toShortString();
        System.out.println("@AfterReturning " + meth);

        convertUserNamesToUpperCase(result);
        System.out.println("Result is: " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* com.demotivirus.Day_017_S2.UserDao.findAllUsers(..))",
            throwing = "exception"
    )
    public void testThrowings(JoinPoint joinPoint, Exception exception){
        String meth = joinPoint.getSignature().toShortString();
        System.out.println("@AfterThrowing " + meth);
        System.out.println("THE EXCEPTION IS: " + exception);
    }

    @Before("com.demotivirus.Day_017_S2.aspectJoinPoint.AspectExpression.forAll()")
    public void testJoinPoint(JoinPoint joinPoint){
        System.out.println("Test join point in " + getClass());
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature " + signature);

        Object[] args = joinPoint.getArgs();
        for (Object o : args){
            System.out.println(o);
            if (o instanceof User){
                User user = (User) o;
                System.out.println("User name: " + user.getName());
                System.out.println("User password " + user.getPassword());
            }
        }
    }

    private void convertUserNamesToUpperCase(List<User> users){
        for (User user : users)
            user.setName(user.getName().toUpperCase());
    }
}
