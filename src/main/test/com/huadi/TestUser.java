package com.huadi;


import com.huadi.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;

@ContextConfiguration("classpath:applicationContext.xml")  //加载spring配置文件，构建spring容器
@RunWith(SpringJUnit4ClassRunner.class)  //spring测试注解
public class TestUser {

    @Autowired
    private BeanFactory beanFactory;  //spring的Bean工厂对象

    @Test
    public  void testUser(){
        User user = beanFactory.getBean("user", User.class);//获取容器中的User对象
        System.out.println(user);
    }


}
