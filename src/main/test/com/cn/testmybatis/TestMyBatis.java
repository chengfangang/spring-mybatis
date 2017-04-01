package com.cn.testmybatis;


import com.cn.hnust.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import com.cn.hnust.pojo.User;
import com.alibaba.fastjson.JSON;
/**
 * Created by chengfangang on 17/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private IUserService userService = null;

    @Test
    public void test1() {
        User user = userService.getUserById(2);
        User user1 = new User();
        user1.setAge(24);
        user1.setPassword("123456");
        user1.setUserName("admin");

        logger.info(JSON.toJSONString(user1));
        userService.insertUser(user1);
        logger.info(JSON.toJSONString(user));
    }
}
