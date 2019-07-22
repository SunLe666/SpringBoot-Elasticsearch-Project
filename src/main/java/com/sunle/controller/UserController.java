package com.sunle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunle.dao.UserDao;
import com.sunle.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
    
	@Autowired
    UserDao userDao;

    @PostMapping("/addUser")
    public String addUser(String username, String password, Integer age) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        return String.valueOf(userDao.save(user).getId());// 返回id做验证
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(Integer id) {
        userDao.deleteById(id);
        return "Success!";
    }

    @PutMapping("/updateUser")
    public String updateUser(Integer id, String username, String password, Integer age) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        return String.valueOf(userDao.save(user).getId());// 返回id做验证
    }

    @GetMapping("/getUser")
    public User getUser(Integer id) {
        return userDao.findById(id).get();
    }

    @GetMapping("/getAllUsers")
    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }
}