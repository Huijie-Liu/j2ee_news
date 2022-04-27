package com.jay.store.service;

import com.jay.store.entity.User;
import com.jay.store.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {
    @Autowired
    private IUserService userService;

    @Test
    public void reg() {
        User user = new User();
        user.setUsername("test01");
        userService.reg(user);
        System.out.printf("ok");
    }
}
