package com.huadi.service.impl;

import com.huadi.mapper.UserMapper;
import com.huadi.pojo.User;
import com.huadi.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserLoginServiceImpl implements UserLoginService {

    @Autowired   //注入userMapper
    //修改修改vcs
    private UserMapper userMapper;

    public User getLoginUser(User user) {
        return userMapper.getLoginUser(user);
    }

    public void registerUser(User user) {
           userMapper.registerUser(user);
    }
}
