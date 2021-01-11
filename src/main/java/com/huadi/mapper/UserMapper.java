package com.huadi.mapper;

import com.huadi.pojo.User;

public interface UserMapper {

    public User getLoginUser(User user); //验证登录

    public void registerUser(User user); //注册用户
}
