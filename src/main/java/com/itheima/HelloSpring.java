package com.itheima;

public class HelloSpring {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void show() {
        System.out.println(username + "被成功注入了，IoC容器向" + username + "问好！");
    }
}
