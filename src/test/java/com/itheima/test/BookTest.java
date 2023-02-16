package com.itheima.test;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testDI() {
        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();
    }

    @Test
    public void testBeanScope() {
        BookDao bookDao1 = (BookDao) ac.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ac.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        //给scope传入prototype后，内存地址不同了
    }

    @Test
    public void appForInstanceBook() {
        BookDao bookDao = (BookDao) ac.getBean("bookDao");
        bookDao.save();

    }
}
