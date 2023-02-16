package com.itheima.factory;

import com.itheima.dao.OrderDao;
import com.itheima.dao.impl.OrderDaoImpl;

/**
 * 静态工厂
 */
public class OrderDaoFactory {

    //静态
    public static OrderDao getOrderDao() {
//        System.out.println("factory setUp...");
        return new OrderDaoImpl();
    }
}
