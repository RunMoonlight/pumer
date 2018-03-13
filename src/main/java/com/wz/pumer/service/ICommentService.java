package com.wz.pumer.service;

import com.wz.pumer.beans.CommentBean;

import java.util.List;

public interface ICommentService {


    List<CommentBean> getListComments();

    int addComment(CommentBean bean);

    int updateComment(CommentBean bean);

    int deleteComment(CommentBean bean);


}
