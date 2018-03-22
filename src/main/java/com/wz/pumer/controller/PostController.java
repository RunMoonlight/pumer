package com.wz.pumer.controller;

import com.wz.pumer.beans.PostBean;
import com.wz.pumer.dao.IPostDao;
import com.wz.pumer.service.IPostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "帖子")
public class PostController {

    @Autowired
    IPostDao postDao;

    @ApiOperation(value="获取所有帖子", notes="")
    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public String getAll(ModelMap model){
        List<PostBean> beans= postDao.getListPosts();
        model.addAttribute("postBeans",beans);
        model.addAttribute("post","post");
        return "index";
    }


    @ApiOperation(value="发布新的帖子", notes="")
    @RequestMapping(value = "/addpost",method = RequestMethod.GET)
    public String addPost(){
        PostBean bean=new PostBean("wz","cc",1,1,1,1,1,1,1,"url");
        int insertNum= postDao.addPost(bean);
        System.out.print(insertNum);
        return "index";
    }

    @ApiOperation(value="更新帖子", notes="")
    @RequestMapping(value = "/upost",method = RequestMethod.GET)
    public String updatePost(){
        PostBean bean=new PostBean(106,"wzcc","cc789",1,1,1,1,1,1,1,"url");
        int insertNum=postDao.updatePost(bean);
        System.out.print(insertNum);
        return "index";
    }

    @ApiOperation(value="删除帖子", notes="")
    @RequestMapping(value = "/dpost",method = RequestMethod.GET)
    public String deletePost(){
//        PostBean bean=new PostBean(106,"wz","cc",1,1,1,1,1,1,1,"url");
//        int insertNum= postDao.deletePost(bean);
//        System.out.print(insertNum);
        return "index";
    }
}
