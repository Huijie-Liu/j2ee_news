package com.jay.store.service.impl;

import com.jay.store.entity.User;
import com.jay.store.mapper.UserMapper;
import com.jay.store.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {
        userMapper.insert(user);
    }
}
