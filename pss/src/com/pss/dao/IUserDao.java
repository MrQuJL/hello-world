/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.po.User;
import java.util.List;

/**
 * 用户dao接口
 * @author 曲健磊
 */
public interface IUserDao {
    
    /**
     * 添加用户
     * @param user
     * @return 
     */
    public boolean addUser(User user);
    
    /**
     * 删除用户
     * @param userName
     * @return 
     */
    public boolean delUser(String userName);
    
    /**
     * 修改用户
     * @param user
     * @return 
     */
    public boolean updateUser(User user);
    
    /**
     * 模糊查询用户
     * @param userName
     * @return 
     */
    public List<User> queryUser(String userName);
    
    /**
     * 根据用户的已知信息统计满足条件的用户数
     * userName,password,type
     * @return 
     */
    public int countUserByUserInfo(User user);
    
}
