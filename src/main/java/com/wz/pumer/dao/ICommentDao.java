package com.wz.pumer.dao;

import com.wz.pumer.beans.CommentBean;
import com.wz.pumer.beans.PostBean;

import java.util.List;

public interface ICommentDao {


    List<CommentBean> getListComments();

    int addComment(CommentBean bean);

    int updateComment(CommentBean bean);

    int deleteComment(CommentBean bean);


}
