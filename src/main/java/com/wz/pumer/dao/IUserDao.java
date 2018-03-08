package com.wz.pumer.dao;

import com.wz.pumer.beans.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserDao {


    List<UserBean> queryList();

    UserBean queryUserByNameAndPwd(@Param("username") String name, @Param("password") String pwd);

    int updateUserInfo(UserBean bean);
}
