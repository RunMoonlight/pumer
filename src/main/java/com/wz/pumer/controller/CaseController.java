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
 * @description:
 */
@Controller
@RequestMapping("/case")
@Api(value = "案例管理")
public class CaseController {


    @ApiOperation(value="案例列表", notes="")
    @RequestMapping(value = "/case",method = RequestMethod.GET)
    public String cases(Model model){

        return "case/case";
    }


}
