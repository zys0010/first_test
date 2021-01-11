package com.huadi.service;

import com.huadi.pojo.User;

public interface UserLoginService {

    public User getLoginUser(User user);

    public void registerUser(User user);
}
