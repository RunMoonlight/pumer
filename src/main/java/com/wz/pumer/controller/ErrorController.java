package com.wz.pumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wang_zhen1 on 2017/10/18 0018.
 */
@Controller
public class ErrorController {

    @GetMapping("/400")
    public String badResult(){
        return "other/400";

    }
    @GetMapping("/404")
    public String notFound(){
        return "other/404";

    }
    @GetMapping("/500")
    public String serverError(){
        return "other/500";

    }
}
