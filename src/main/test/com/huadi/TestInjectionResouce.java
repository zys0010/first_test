package com.huadi;


import com.huadi.impl.UserBizImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext2.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestInjectionResouce {

    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void testInjection(){
        UserBizImpl2 userBizImpl = beanFactory.getBean("userBizImpl2", UserBizImpl2.class);
        userBizImpl.saveUser();
    }
}
