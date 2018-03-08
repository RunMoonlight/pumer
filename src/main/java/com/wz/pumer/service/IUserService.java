package com.wz.pumer.service;


import com.wz.pumer.beans.UserBean;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */
public interface IUserService {

    List<UserBean> queryList();

    UserBean queryUserByNameAndPwd(String name, String pwd);

    int updateUserInfo(UserBean bean);
}
