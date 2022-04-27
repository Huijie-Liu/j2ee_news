package com.jay.store.mapper;

import com.jay.store.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Integer insert(User user);

    User findByUsername(String username);
}
