package com.huadi;


import com.huadi.impl.UserBizImpl;
import com.huadi.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")  //加载spring配置文件，构建spring容器
@RunWith(SpringJUnit4ClassRunner.class)  //spring测试注解
public class TestInjectionCons {

    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void testInjection(){
        UserBizImpl userBiz = beanFactory.getBean("userBizImpl",UserBizImpl.class);
        userBiz.saveUser();
    }

    @Test
    public void testInjection2(){
        UserBizImpl userBiz = beanFactory.getBean("userBizImpl",UserBizImpl.class);
        User user = beanFactory.getBean("user",User.class);
        userBiz.saveUser2(user);
    }
}
