package com.matrix.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.matrix.platform.common.exception.MatrixException;
import com.matrix.platform.dao.UserTestMapper;
import com.matrix.platform.entity.UserTest;
import com.matrix.platform.entity.UserTestExample;
import com.matrix.platform.service.IUserService;


@Service
public class UserServiceImpl implements IUserService
{

    @Autowired(required=false)
    private UserTestMapper userTestMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserTest addUser(UserTest user) throws MatrixException
    {

        int result = userTestMapper.insert(user);
        
        if(result > 0)
        {
            return user;
        }

        return null;
    }

    @Override
    public UserTest getUserById(int userId) throws MatrixException
    {
        UserTest user = userTestMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public List<UserTest> getUsers() throws MatrixException
    {
        UserTestExample example = new UserTestExample();
        example.createCriteria().andNameIsNotNull();
        
        return userTestMapper.selectByExample(example);
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateUser(UserTest user) throws MatrixException
    {
        return userTestMapper.updateByPrimaryKey(user);
    }

}
