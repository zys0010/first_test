package com.huadi.impl;

import com.huadi.dao.UserDao;
import com.huadi.pojo.User;

import javax.annotation.Resource;

public class UserBizImpl2 {

    @Resource(name = "userDao")  //加载spring容器中名称为"userDao"的bean对象
    private UserDao userDao;

    public void saveUser(){
        User user = new User();
        user.setUsername("lily");
        user.setSex("女");
        user.setAge(20);
        userDao.saveUser(user);
    }
}
