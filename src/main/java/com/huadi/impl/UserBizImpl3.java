package com.huadi.impl;


import com.huadi.dao.UserDao;
import com.huadi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 自动装配测试
 */
public class UserBizImpl3 {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Autowired   //自动装配
    @Qualifier("userDao")  //限定容器加载bean的名称
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public UserBizImpl3(UserDao userDao){
          this.userDao = userDao;
    }
    public void saveUser(){
        User user = new User();
        user.setUsername("lily");
        user.setSex("女");
        user.setAge(20);
        userDao.saveUser(user);
    }
}
