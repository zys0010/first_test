package com.huadi;


import com.huadi.impl.UserBizImpl3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext3.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestInjectionAuto {

    @Autowired
    private BeanFactory beanFactory;

    @Test
    public void testInjection(){
        UserBizImpl3 userBizImpl3 =beanFactory.getBean("userBizImpl3", UserBizImpl3.class);
        userBizImpl3.saveUser();

    }
}
