package com.test;

import chenlong.Application;
import chenlong.bean.User;
import chenlong.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UserTest {
    @Resource
    private UserMapper userMapper;
    @Test
    public void test01(){
        User user=new User();
        user.setUsername("jack");
        user.setPassword("123456");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
}
