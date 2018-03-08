package com.wz.pumer.controller;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.logging.Logger;


/**
 * @author: wangzhen
 * @date: 2018/3/6
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserDao userDao;

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public String getAll(Model model){
        List<UserBean> userBeans= userDao.queryList();
        System.out.print(userBeans.toArray().toString());

        return "";
    }
}
