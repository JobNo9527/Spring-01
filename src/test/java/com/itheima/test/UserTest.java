package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaoFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void appForInstanceFactoryUser() {
//        //创建实例工厂
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        //通过工厂创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

//        spring的方法测试
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.save();

    }
}
