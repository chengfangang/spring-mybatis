package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.mybatis.spring.annotation.MapperScan;

//@MapperScan
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Insert("INSERT INTO user_t(user_name, password, age) VALUES(#{userName}, #{password}, #{age})")
    int insertTest(User record);

}