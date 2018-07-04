/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;


import com.pss.po.Customer;
import java.util.List;

/**
 * 客户数据访问接口
 * @author 张思雨
 * @author 张琦
 */
public interface ICustomerDao {
    
    public boolean insertCustomer(Customer cus);
    
    public boolean deleteCustomer(String id);
    
    public boolean updateCustomer(Customer cus);
    
    public List<Customer> findAll();
    
    public List<Customer> findAll(String key);
    
    public boolean saveCustomer(Customer cus);
    
    public boolean exitCustomer();
    
    public boolean cancelCustomer();
    
}
