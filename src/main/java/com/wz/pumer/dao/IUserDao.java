package com.wz.pumer.dao;

import com.wz.pumer.beans.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {



    UserBean loginByNameAndPwd(@Param("username") String name, @Param("password") String pwd);

    UserBean loginByqq(@Param("qq") String qq);

    UserBean getUserById(@Param("id") String id);

    int updateUserInfo(UserBean bean);

    int regUser(UserBean bean);



}
