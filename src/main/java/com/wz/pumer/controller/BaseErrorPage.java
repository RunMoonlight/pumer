package com.wz.pumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wang_zhen1 on 2017/10/18 0018.
 */
@Controller
@RequestMapping("/error")
public class BaseErrorPage implements ErrorController {


    Logger logger = LoggerFactory.getLogger(BaseErrorPage.class);

    @Override
    public String getErrorPath() {
        logger.info("进入自定义错误页面");
        return "other/404";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }


}
