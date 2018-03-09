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
    public PostBean getUserByNameAndPwd(String name, String pwd) {
        return postDao.getUserByNameAndPwd(name,pwd);
    }
}
