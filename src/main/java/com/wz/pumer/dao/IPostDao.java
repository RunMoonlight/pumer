package com.wz.pumer.dao;

import com.wz.pumer.beans.PostBean;

import java.util.List;

public interface IPostDao {


    List<PostBean> getListPosts();

    int addPost(PostBean postBean);

    int updatePost(PostBean postBean);

    int deletePost(PostBean postBean);


}
