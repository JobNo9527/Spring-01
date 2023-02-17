package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.EmployeeDao;
import com.itheima.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;
    private BookDao bookDao;

    /**
     * 给配置文件的constructor-arg标签name传值的时候，注意是传入形参而不是属性值（成员变量）
     */
    public EmployeeServiceImpl(EmployeeDao employeeDao, BookDao bookDao) {
        this.employeeDao = employeeDao;
        this.bookDao = bookDao;

    }

    @Override
    public void save() {
        System.out.println("employee service save...");
        employeeDao.save();
        bookDao.save();
    }
}
