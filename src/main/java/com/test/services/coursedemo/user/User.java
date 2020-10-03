package com.test.services.coursedemo.user;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private Date birthData;

    public User(int id, String name, Date birthData) {
        this.id = id;
        this.name = name;
        this.birthData = birthData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthData() {
        return birthData;
    }

    public void setBirthData(Date birthData) {
        this.birthData = birthData;
    }
}
