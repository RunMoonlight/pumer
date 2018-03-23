package com.wz.pumer.service;

import com.wz.pumer.beans.UserOpenBean;

import java.util.List;

public interface IUserOpenService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOpenBean record);

    UserOpenBean selectByPrimaryKey(Integer id);

    List<UserOpenBean> selectAll();

    int updateByPrimaryKey(UserOpenBean record);
}