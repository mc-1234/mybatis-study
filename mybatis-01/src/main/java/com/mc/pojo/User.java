package com.mc.pojo;

import java.util.Date;

/**
 * @Author machong
 * Date on 2021/3/12  16:34
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date registTime;

    public User() {
    }

    public User(int id, String username, String password, Date registTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.registTime = registTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registTime=" + registTime +
                '}';
    }
}
