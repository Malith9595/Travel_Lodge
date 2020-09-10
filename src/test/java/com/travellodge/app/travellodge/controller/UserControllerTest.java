package com.travellodge.app.travellodge.controller;

import com.travellodge.app.travellodge.model.User;
import com.travellodge.app.travellodge.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @Mock //Mock User Service
    UserService userService;

    @InjectMocks //Mock Current user controller
    UserController userController;

    @Test
    public void testCreateUser() {
        User newUser = new User();
        newUser.setFirstName("Malith");
        newUser.setLastName("Idd");
        newUser.setEmail("malith95@gmail.com");
        newUser.setUserName("malith123");
        newUser.setMobile("0774430067");
        newUser.setPassword("123");

        Date createdDate = new Date();

        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setCreatedAt(createdDate);
        expectedUser.setUpdatedAt(createdDate);
        expectedUser.setFirstName("Malith");
        expectedUser.setLastName("Idd");
        expectedUser.setEmail("malith95@gmail.com");
        expectedUser.setUserName("malith123");
        expectedUser.setMobile("0774430067");
        expectedUser.setPassword("123");

        when(userService.createUser(newUser)).thenReturn(expectedUser);//Mocking userService createUser() method
        assertEquals(expectedUser, userController.createUser(newUser));// Assert expected result and the actual result
    }

    @Test
    public void testGetUserById(){

        Date createdDate = new Date();

        User expectedUser = new User();
        expectedUser.setId(1);
        expectedUser.setCreatedAt(createdDate);
        expectedUser.setUpdatedAt(createdDate);
        expectedUser.setFirstName("Malith");
        expectedUser.setLastName("Idd");
        expectedUser.setEmail("malith95@gmail.com");
        expectedUser.setUserName("malith123");
        expectedUser.setMobile("0774430067");
        expectedUser.setPassword("123");

        when(userService.getUserById(1L)).thenReturn(expectedUser);
        assertEquals(expectedUser, userController.getUserById(1L));

    }
}
