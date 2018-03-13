package com.wz.pumer.controller;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.dao.IUserDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "用户管理")
public class UserController {

    @Autowired
    IUserDao userDao;

    @ApiOperation(value="激活邮箱", notes="用户激活邮箱")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/activate",method = RequestMethod.GET)
    public String activate(Model model){

        return "user/activate";
    }

    @ApiOperation(value="找回密码", notes="找回密码")
    @RequestMapping(value = "/forget",method = RequestMethod.GET)
    public String forget(Model model){

        return "user/forget";
    }
    @ApiOperation(value="用户个人主页", notes="用户个人主页")
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model){

        return "user/home";
    }

    @ApiOperation(value="用户个人中心", notes="")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String info(Model model){

        return "user/index";
    }

    @ApiOperation(value="用户个人登入", notes="")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){

        return "user/login";
    }

    @ApiOperation(value="我的消息", notes="")
    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public String message(Model model){

        return "user/message";
    }

    @ApiOperation(value="用户注册", notes="")
    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String reg(Model model){

        return "user/reg";
    }

    @ApiOperation(value="用户设置", notes="")
    @RequestMapping(value = "/set",method = RequestMethod.GET)
    public String set(Model model){

        return "user/set";
    }
}
