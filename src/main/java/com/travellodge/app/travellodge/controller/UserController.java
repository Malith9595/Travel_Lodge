package com.travellodge.app.travellodge.controller;

import com.travellodge.app.travellodge.model.User;
import com.travellodge.app.travellodge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// Design Pattern: MVC
// Controller = Intermediary layer between View and Model.
@RestController
public class UserController {

    @Autowired //Injecting UserService as a dependency to UserController via @Autowired (Dependency Injection)
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User newUser){
        // Design Principle: Programming to interface not to the implementation
        return userService.createUser(newUser);//return type User
    }

    @GetMapping("/user/{userId}")
    User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User updatedUser){
        return userService.updateUser(userId, updatedUser);
    }

    @DeleteMapping("/user/{userId}")
    void deleteUserById(@PathVariable Long userId) {
        userService.deleteUserById(userId);
    }

}
