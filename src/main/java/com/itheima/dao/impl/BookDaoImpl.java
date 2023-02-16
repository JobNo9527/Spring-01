package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    //就算构造方法是私有的，spring依旧能够实例化对象，这是因为spring用了反射的机制
//    public BookDaoImpl() {
//        System.out.println("book dao constructor is running...");
//    }

    //报错，spring调用的都是无参构造
    //NoSuchMethodException: com.itheima.dao.impl.BookDaoImpl.<init>() <- 无参的初始 <- 无参构造 <- 没有这样的方法异常，也就是说某个地方带参构造了要改无参
//    private BookDaoImpl(int i) {
//        System.out.println("book dao constructor is running...");
//    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
