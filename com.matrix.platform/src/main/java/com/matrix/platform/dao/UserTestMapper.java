package com.matrix.platform.dao;

import com.matrix.platform.entity.UserTest;
import com.matrix.platform.entity.UserTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface UserTestMapper
{

    long countByExample(UserTestExample example);

    int deleteByExample(UserTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    List<UserTest> selectByExample(UserTestExample example);

    UserTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByExample(@Param("record") UserTest record, @Param("example") UserTestExample example);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}