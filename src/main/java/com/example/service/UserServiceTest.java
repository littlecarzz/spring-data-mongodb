package com.example.service;

import com.example.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@ContextConfiguration({ "classpath:spring-context.xml",
        "classpath:mongoDB.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
    @Resource(name = "userService")
    private UserService userService;
    @Test
    public void test(){
        User user = userService.findUserByName("cjj");
        System.out.println(user);
    }
}
