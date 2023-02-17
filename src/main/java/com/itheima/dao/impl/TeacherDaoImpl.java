package com.itheima.dao.impl;

import com.itheima.dao.TeacherDao;

import java.util.*;

public class TeacherDaoImpl implements TeacherDao {

    private int[] array;

    private List<String> list;

    private Set<String> set;

    private Map<String, String> map;

    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("teacher dao save...");

        System.out.println("数组遍历：" + Arrays.toString(array));
        System.out.println("list遍历：" + list);
        System.out.println("set遍历：" + set);
        System.out.println("map遍历：" + map);
        System.out.println("properties遍历：" + properties);
    }
}
