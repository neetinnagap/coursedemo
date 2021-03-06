package com.test.services.coursedemo.user;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

public class User {
    private int id;

    @Size(min=2, message = "Name should be atleast 2 characters in length")
    private String name;

    @Past(message = "Birth date cannot be in future")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
