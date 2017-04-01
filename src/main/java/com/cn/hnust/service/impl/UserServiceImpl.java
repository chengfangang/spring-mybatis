package com.cn.hnust.service.impl;

import com.cn.hnust.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
/**
 * Created by chengfangang on 17/3/31.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    public int insertUser(User user) {
        return this.userDao.insertTest(user);
    }


}
