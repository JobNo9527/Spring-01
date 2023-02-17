package com.itheima.test;

import com.itheima.dao.EmployeeDao;
import com.itheima.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

    /**
     * 测试构造器注入
     */
    @Test
    public void testConstructorDI() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = (EmployeeService) ac.getBean("employeeService");
        employeeService.save();
    }
}
