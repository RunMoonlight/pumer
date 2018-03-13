package com.wz.pumer.service.impl;

import com.wz.pumer.beans.CommentBean;
import com.wz.pumer.beans.PostBean;
import com.wz.pumer.dao.ICommentDao;
import com.wz.pumer.dao.IPostDao;
import com.wz.pumer.service.ICommentService;
import com.wz.pumer.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */

@Service
public class ICommentServiceImpl implements ICommentService {
    @Autowired
    public ICommentDao commentDao;


    @Override
    public List<CommentBean> getListComments() {
        return commentDao.getListComments();
    }

    @Override
    public int addComment(CommentBean bean) {
        return commentDao.addComment(bean);
    }

    @Override
    public int updateComment(CommentBean bean) {
        return commentDao.updateComment(bean);
    }

    @Override
    public int deleteComment(CommentBean bean) {
        return commentDao.deleteComment(bean);
    }
}
