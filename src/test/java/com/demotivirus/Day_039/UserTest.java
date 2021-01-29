package com.demotivirus.Day_039;

import com.demotivirus.Day_039.user.User;
import com.demotivirus.Day_039.user.UserDao;
import com.demotivirus.Day_039.user.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class UserTest {
    @MockBean
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void getUserTest(){
        String email = "djosipovic0";
        User user = new User();
        user.setEmail(email);

        Mockito.when(userDao.getOne(1L)).thenReturn(user);
        user = userService.getUserById(1L);
        System.err.println("The user is: " + user);
        Assertions.assertEquals(email, user.getEmail());
    }
}
