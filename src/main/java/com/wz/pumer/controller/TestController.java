package com.wz.pumer.controller;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/test")
@Api(value = "用户管理")
public class TestController {

    @Autowired
    RedisService redisService;


    @ApiOperation(value="用户个人中心", notes="")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String info(Model model){

        return "test";
    }

    @ApiOperation(value="用户个人登入", notes="")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginpwd(@ModelAttribute("userBean") UserBean userBean, BindingResult bindingResult, Model model){


        System.out.print(""+userBean.getName());
        return "test";
    }
    @ApiOperation(value="redis 测试", notes="")
    @RequestMapping(value = "/redis",method = RequestMethod.GET)
    public String redisTest( Model model){

        //如果缓存存在
        Object object  =redisService.get("wangzhen");
        return "test";
    }
}
