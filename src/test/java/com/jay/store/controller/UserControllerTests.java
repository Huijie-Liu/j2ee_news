package com.jay.store.controller;

import com.jay.store.entity.User;
import com.jay.store.service.IUserService;
import com.jay.store.util.JsonResult;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTests {
    @Autowired
    private IUserService userService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(){
        User user = new User();
        user.setUsername("test2");

        JsonResult<Void> result = new JsonResult<>();

        userService.reg(user);

        result.setState(200);

        return result;
    }
}
