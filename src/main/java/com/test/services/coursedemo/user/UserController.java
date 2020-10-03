package com.test.services.coursedemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<Object> save(@RequestBody User user) {
        var createdUser = userDao.save(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
