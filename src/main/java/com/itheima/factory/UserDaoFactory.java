package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class UserDaoFactory {

    // 非静态
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
