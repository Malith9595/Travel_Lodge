package com.travellodge.app.travellodge.service.impl;

import com.travellodge.app.travellodge.model.User;
import com.travellodge.app.travellodge.repository.UserRepository;
import com.travellodge.app.travellodge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

// Model = Holds data and business logic
@Service
public class UserServiceImpl implements UserService {

    @Autowired //Injecting UserRepository as a dependency to UserService via (Dependency Injection)
    private UserRepository userRepository;

    public User createUser(User user) {
        user.setCreatedAt(new Date());
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override //implementation detail
    public User updateUser(Long userId, User user) {
        Optional<User> existingUserOptional = userRepository.findById(userId);//Checks if the user already exists in the database
        if(existingUserOptional.isPresent()){
            User existingUser = existingUserOptional.get();//If existing modify the same user
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setEmail(user.getEmail());
            existingUser.setMobile(user.getMobile());
            existingUser.setPassword(user.getPassword());
            existingUser.setUpdatedAt(new Date());
            return userRepository.save(existingUser);
        }
        return null;
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
