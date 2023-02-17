package com.itheima.service.impl;

import com.itheima.dao.BookDao;

import com.itheima.dao.OrderDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;
    private OrderDao orderDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        orderDao.save();
    }
}
