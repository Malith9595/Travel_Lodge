package com.travellodge.app.travellodge.service;

import com.travellodge.app.travellodge.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    User updateUser(Long userId, User updatedUser);
    void deleteUserById(Long userId);
}
