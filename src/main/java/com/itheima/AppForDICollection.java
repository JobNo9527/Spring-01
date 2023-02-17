package com.itheima;

import com.itheima.dao.TeacherDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDICollection {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherDao teacherDao = (TeacherDao) applicationContext.getBean("teacherDao");

        teacherDao.save();




    }
}
