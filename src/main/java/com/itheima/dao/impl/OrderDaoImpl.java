package com.itheima.dao.impl;

import com.itheima.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    //演示如何给基本类型进行setter注入
    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("order dao save..." + connectionNum + "," + databaseName);
    }
}
