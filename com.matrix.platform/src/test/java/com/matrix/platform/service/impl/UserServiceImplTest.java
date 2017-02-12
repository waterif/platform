package com.matrix.platform.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.matrix.platform.entity.UserTest;
import com.matrix.platform.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring*.xml", "classpath*:spring*/spring*.xml"})
public class UserServiceImplTest
{
    @Autowired
    private IUserService userService;

    @Test
    public void testAddUser()
    {
        UserTest user = new UserTest();
        
        user.setEmail("test3@yeah.net");
        user.setName("test");
        user.setPassword("hello");
        user.setPhone(123456789);
        
        user = userService.addUser(user);
        
        System.out.println(user);
    }

    @Test
    public void testGetUserById()
    {
    }

    @Test
    public void testGetUsers()
    {
    }

    @Test
    public void testUpdateUser()
    {
    }

}
