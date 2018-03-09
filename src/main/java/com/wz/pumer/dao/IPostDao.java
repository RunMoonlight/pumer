package com.wz.pumer.dao;

import com.wz.pumer.beans.PostBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPostDao {


    List<PostBean> getListPosts();

    PostBean getUserByNameAndPwd(@Param("username") String name, @Param("password") String pwd);

}
