package com.wz.pumer.service;

import com.wz.pumer.beans.PostBean;
import javafx.geometry.Pos;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPostService {


    List<PostBean> getListPosts();

    int addPost(PostBean bean);

    int updatePost(PostBean postBean);

    int deletePost(PostBean postBean);

}
