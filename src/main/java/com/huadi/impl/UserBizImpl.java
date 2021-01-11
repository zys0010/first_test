package com.huadi.impl;


import com.huadi.dao.UserDao;
import com.huadi.pojo.User;

/**
 * 用户存储业务类
 */
public class UserBizImpl {

    private UserDao userDao;
    private String username;
    private String sex;
    private Integer age;

    /*
    实现userDao的setter方法
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserBizImpl(){

    }
/*
   构造器注入1
    */
//    public UserBizImpl(UserDao userDao){
//       this.userDao = userDao;
//    }
   /*
   构造器注入2
    */
    public UserBizImpl(UserDao userDao,String username,String sex,Integer age){
        this.userDao = userDao;
        this.username = username;
        this.sex  = sex;
        this.age = age;
    }
    public void saveUser(){
       User user = new User();
       user.setUsername("jacky");
       user.setSex("男");
       user.setAge(25);
        userDao.saveUser(user);
    }

    public void saveUser2(User user){
        user.setUsername(username);
        user.setSex(sex);
        user.setAge(age);
        userDao.saveUser(user);
    }
}
