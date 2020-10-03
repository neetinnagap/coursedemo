package com.test.services.coursedemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping(path = "/users")
    public List<User> findALl() {
        return userDao.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User findOne(@PathVariable int id) {
        return userDao.findOne(id);
    }

    @PostMapping(path = "/users")
    public User save(@RequestBody User user) {
        return userDao.save(user);
    }
}
