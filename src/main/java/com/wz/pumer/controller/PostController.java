package com.wz.pumer.controller;

import com.wz.pumer.beans.PostBean;
import com.wz.pumer.dao.IPostDao;
import com.wz.pumer.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author: wangzhen
 * @date: 2018/3/8
 * @description: 帖子
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    IPostDao postDao;
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public String getAll(ModelMap model){
        List<PostBean> beans= postDao.getListPosts();
        model.addAttribute("postBeans",beans);
        model.addAttribute("post","post");
        return "index";
    }
}
