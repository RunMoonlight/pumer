package com.wz.pumer.controller;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.beans.param.RegParam;
import com.wz.pumer.dao.IUserDao;
import com.wz.pumer.utils.TimeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;


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
    @RequestMapping(value = "/loginpost",method = RequestMethod.POST)
    public String loginpwd(@ModelAttribute("userBean") UserBean userBean,  Model model){


        UserBean userInfo= userDao.loginByNameAndPwd(userBean.getNickname(),userBean.getPassword());
        System.out.print(""+userInfo.getName());
        return "user/login";
    }

    @ApiOperation(value="用户个人登入", notes="")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login( Model model,HttpServletRequest request){
        model.addAttribute("userBean",new UserBean());
        HttpSession session = request.getSession();
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
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
        model.addAttribute("regParam",new RegParam());

        return "user/reg";
    }
    @ApiOperation(value="用户注册", notes="")
    @RequestMapping(value = "/reguser",method = RequestMethod.POST)
    public String reguser(@ModelAttribute("regParam") RegParam regParam,Model model){
        if(!regParam.getPwd().equals(regParam.getRepwd())){
            return "user/reg";
        }
        int createTime= TimeUtils.getCurrentTime();

        UserBean userBean=new UserBean(regParam.getName(),regParam.getNickname(),regParam.getEmail(),regParam.getPwd(),0,0,createTime ,0,null);
        int regSucc= userDao.regUser(userBean);
        if (regSucc==1){

            model.addAttribute("userBean",userBean);
            return "user/reg";
        }else {

            return "user/reg";
        }
    }


    @ApiOperation(value="用户设置", notes="")
    @RequestMapping(value = "/set",method = RequestMethod.GET)
    public String set(Model model){

        return "user/set";
    }


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){

        return "index";
    }
}
