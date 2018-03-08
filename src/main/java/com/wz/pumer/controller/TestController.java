package com.wz.pumer.controller;

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
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String showMain(Model model){
        return "index";
    }
}
