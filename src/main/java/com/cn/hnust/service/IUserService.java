package com.cn.hnust.service;

import com.cn.hnust.pojo.User;
/**
 * Created by chengfangang on 17/3/31.
 */
public interface IUserService {
    User getUserById(int userId);
    int insertUser(User user);
}
