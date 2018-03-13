package com.wz.pumer.service.impl;

import com.wz.pumer.beans.PostBean;
import com.wz.pumer.dao.IPostDao;
import com.wz.pumer.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */

@Service
public class IPostServiceImpl implements IPostService {
    @Autowired
    public IPostDao postDao;

    @Override
    public List<PostBean> getListPosts() {
        return postDao.getListPosts();
    }

    @Override
    public int addPost(PostBean bean) {
        return postDao.addPost(bean);
    }

    @Override
    public int updatePost(PostBean postBean) {
        return postDao.updatePost(postBean);
    }

    @Override
    public int deletePost(PostBean postBean) {
        return postDao.deletePost(postBean);
    }
}
