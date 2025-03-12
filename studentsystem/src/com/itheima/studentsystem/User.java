package com.itheima.studentsystem;

public class User {
    private String userName;
    private String password;
    private String id;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String password, String id, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
