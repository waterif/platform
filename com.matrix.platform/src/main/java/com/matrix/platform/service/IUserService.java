package com.matrix.platform.service;

import java.util.List;

import com.matrix.platform.entity.UserTest;


public interface IUserService
{

    UserTest addUser(UserTest user);

    UserTest getUserById(int userId);

    List<UserTest> getUsers();
    
    int updateUser(UserTest user);
}
