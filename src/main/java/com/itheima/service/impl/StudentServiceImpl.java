package com.itheima.service.impl;

import com.itheima.dao.StudentDao;
import com.itheima.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save() {
        System.out.println("student service save...");
        studentDao.save();
    }
}
