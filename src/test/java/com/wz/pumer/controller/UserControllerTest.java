package com.wz.pumer.controller;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
     @Autowired
    private IUserService userService;
    @Test
    public void getAll() {
        List<UserBean> userBeans= userService.queryList();

        System.out.println("userBeans  Size:"+userBeans.size());
    }
}