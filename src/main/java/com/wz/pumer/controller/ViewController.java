package com.wz.pumer.controller;

import com.wz.pumer.dao.IUserDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author: wangzhen
 * @date: 2018/3/6
 * @description:view
 */
@Controller
@RequestMapping("")
public class ViewController {


    /*
    激活邮箱
   */
    @RequestMapping(value = "/activate", method = RequestMethod.GET)
    public String activate(Model model) {
        return "user/activate";
    }

    /*
    找回密码
     */
    @RequestMapping(value = "/forget", method = RequestMethod.GET)
    public String forget(Model model) {

        return "user/forget";
    }

    /*
   用户个人主页
    */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String home(Model model) {

        return "user/home";
    }

    /*
    用户个人中心
    */
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info(Model model) {

        return "user/index";
    }

    /*
  用户个人登入
   */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {

        return "user/login";
    }

    @ApiOperation(value = "我的消息", notes = "")
    /*
   我的消息
    */
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String message(Model model) {

        return "user/message";
    }

    /*
   用户注册
    */
    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String reg(Model model) {

        return "user/reg";
    }

    /*
用户设置
 */
    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public String set(Model model) {

        return "user/set";
    }

    /*
    帖子详情
    */
    @RequestMapping(value = "/post/detail", method = RequestMethod.GET)
    public String postDetail(Model model) {

        return "jie/detail";
    }

    /*
    发布帖子
   */
    @RequestMapping(value = "/post/add", method = RequestMethod.GET)
    public String postAdd(Model model) {

        return "jie/add";
    }


}
