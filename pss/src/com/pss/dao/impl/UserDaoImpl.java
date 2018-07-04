/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IUserDao;
import com.pss.po.User;
import java.util.List;

/**
 * UserDaoImpl接口实现类
 * @author 曲健磊
 */
public class UserDaoImpl extends BaseDao implements IUserDao {

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO pss_user VALUES(?,?,?,?,?)";
        Object[] params = {user.getUserName(),user.getPassword(),user.getType(),user.getRealName(),user.getUserNo()};
        boolean flag = this.update(sql, params);
        return flag;
    }

    @Override
    public boolean delUser(String userName) {
        String sql = "DELETE FROM pss_user WHERE user_name = ?";
        Object[] params = {userName};
        boolean flag = this.update(sql, params);
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        String sql = "UPDATE pss_user SET password=?, real_name=?, user_no=? WHERE user_name=?";
        Object[] params = {user.getPassword(),user.getRealName(),user.getUserNo(),user.getUserName()};
        return this.update(sql, params);
    }

    @Override
    public List<User> queryUser(String userName) {
        String sql = "SELECT user_name userName,password password,type type,real_name realName,user_no userNo FROM pss_user WHERE user_name like ?";
        Object[] params = {"%" + userName + "%"};
        List<User> userList = this.query(sql, User.class, params);
        return userList;
    }

    @Override
    public int countUserByUserInfo(User user) {
        String sql = "SELECT user_name userName,password password,type,real_name realName,user_no userNo FROM pss_user user WHERE user_name = ? AND password = ? AND type = ?";
        List<User> userList = this.query(sql, User.class, user.getUserName(),user.getPassword(),user.getType());
        return userList.size();
    }
    
}
