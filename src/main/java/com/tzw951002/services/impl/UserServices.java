package com.tzw951002.services.impl;

import com.tzw951002.mapper.UserMapper;
import com.tzw951002.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements com.tzw951002.services.UserServices {
    //insert Mapper
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
