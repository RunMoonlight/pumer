package com.wz.pumer.service.impl;

import com.wz.pumer.beans.UserBean;
import com.wz.pumer.beans.UserOpenBean;
import com.wz.pumer.dao.IUserDao;
import com.wz.pumer.dao.IUserOpenDao;
import com.wz.pumer.service.IUserOpenService;
import com.wz.pumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wang_zhen1 on 2017/10/16 0016.
 */

@Service
public class IUserOpenServiceImpl implements IUserOpenService {
    @Autowired
    public IUserOpenDao userOpenDao;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userOpenDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserOpenBean record) {
        return userOpenDao.insert(record);
    }

    @Override
    public UserOpenBean selectByPrimaryKey(Integer id) {
        return userOpenDao.selectByPrimaryKey(id);
    }

    @Override
    public List<UserOpenBean> selectAll() {
        return userOpenDao.selectAll();
    }

    @Override
    public int updateByPrimaryKey(UserOpenBean record) {
        return userOpenDao.updateByPrimaryKey(record);
    }
}
