/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service;

import com.pss.po.User;
import java.util.List;

/**
 * 样例服务层接口
 * @author 曲健磊
 */
public interface IUserService {
    
    /**
     * 添加用户
     * @param user
     * @return 
     */
    public boolean addUser(User user);
    
    /**
     * 删除用户
     * @param userId
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
     * 验证普通用户是否登录成功
     * @param user
     * @return 
     */
    public boolean loginUser(User user);
    
    /**
     * 验证管理员是否登录成功
     * @param user
     * @return 
     */
    public boolean loginAdmin(User user);
    
}
