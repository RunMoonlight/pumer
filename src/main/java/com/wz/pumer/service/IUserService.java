package com.wz.pumer.service;


import com.wz.pumer.beans.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */
public interface IUserService {

    UserBean loginByNameAndPwd(String name, String pwd);

    UserBean loginByqq(String qq);

    UserBean getUserById( String id);

    int updateUserInfo(UserBean bean);

    int regUser(UserBean bean);
}
