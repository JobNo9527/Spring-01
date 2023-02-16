package com.itheima.test;

import com.itheima.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring = ac.getBean("helloSpring", HelloSpring.class);
        helloSpring.show();
    }
}
