package com.itheima.dao.impl;

import com.itheima.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {

//    基本数据类型
    private int connectionNum;
    private String databaseName;

    public EmployeeDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("employee dao save..." + connectionNum + "," + databaseName);
    }
}
