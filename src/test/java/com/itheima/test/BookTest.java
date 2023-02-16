package com.itheima.test;

import com.itheima.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

    @Test
    public void testIoC() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ac.getBean("bookService");
        bookService.save();
    }
}
