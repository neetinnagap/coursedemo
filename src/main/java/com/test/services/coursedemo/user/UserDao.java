package com.test.services.coursedemo.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDao {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Sheldon", new Date()));
        users.add(new User(2, "Georgie", new Date()));
        users.add(new User(3, "Missy", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(users.size() + 1);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().get();
    }
}
