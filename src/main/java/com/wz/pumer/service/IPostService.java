package com.wz.pumer.service;

import com.wz.pumer.beans.PostBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPostService {


    List<PostBean> getListPosts();

    PostBean getUserByNameAndPwd(String name, String pwd);

}
