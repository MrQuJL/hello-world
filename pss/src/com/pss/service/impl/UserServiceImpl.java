/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IUserDao;
import com.pss.dao.impl.UserDaoImpl;
import com.pss.po.User;
import com.pss.service.IUserService;
import java.util.List;

/**
 * IUserService接口的实现类
 * @author 曲健磊
 */
public class UserServiceImpl implements IUserService {
    private IUserDao userDao = new UserDaoImpl();

    @Override
    public boolean addUser(User user) {
        user.setType("2");
        return this.userDao.addUser(user);
    }

    @Override
    public boolean delUser(String userName) {
        return this.userDao.delUser(userName);
    }

    @Override
    public boolean updateUser(User user) {
        return this.userDao.updateUser(user);
    }

    @Override
    public List<User> queryUser(String userName) {
        return this.userDao.queryUser(userName);
    }

    @Override
    public boolean loginUser(User user) {
        user.setType("2"); // 普通用户
        int count = userDao.countUserByUserInfo(user);
        return count > 0 ? true : false;
    }

    @Override
    public boolean loginAdmin(User user) {
        user.setType("1"); // 管理员
        int count = userDao.countUserByUserInfo(user);
        return count > 0 ? true : false;
    }
    
    
}
