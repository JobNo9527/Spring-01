package com.itheima.test;

import com.itheima.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    /**
     * 测试自动装填
     */
    @Test
    public void testStudentAutoWare(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) ac.getBean("studentService");
        studentService.save();
    }
}
