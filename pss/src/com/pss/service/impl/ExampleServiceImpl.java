/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IExampleDao;
import com.pss.dao.impl.ExampleDaoImpl;
import com.pss.service.IExampleService;

/**
 * IExampleService接口的实现类
 * @author 曲健磊
 */
public class ExampleServiceImpl implements IExampleService {
    private IExampleDao exampleDao = new ExampleDaoImpl();
    
    @Override
    public void insertExample() {
        // 执行一些其他功能...
        exampleDao.insertExample();
        // 执行一些其他功能...
    }
    
}
