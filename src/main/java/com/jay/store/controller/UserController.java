package com.jay.store.controller;

import com.jay.store.entity.User;
import com.jay.store.service.IUserService;
import com.jay.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("reg")
    public JsonResult<Void> reg(User user){
        JsonResult<Void> result = new JsonResult<>();

        userService.reg(user);
        result.setState(200);
        result.setMessage("successful!");

        return result;
    }

}
