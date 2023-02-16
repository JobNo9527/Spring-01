package com.itheima.test;

import com.itheima.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void appForInstanceOrder() {
        //通过静态工厂创建对象
        OrderDao orderDao = (OrderDao) ac.getBean("orderDao");
        orderDao.save();
    }


}
