package com.jay.store.service;

import com.jay.store.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    void reg(User user);
}
