/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.ICustomerDao;
import com.pss.dao.impl.CustomerDaoImpl;
import com.pss.service.ICustomerService;

/**
 * ICustomerService的实现类
 * @author 张思雨
 * @author 张琦
 */
public class CustomerServiceImpl implements ICustomerService{
    private ICustomerDao customerDao = new CustomerDaoImpl();
    
}
