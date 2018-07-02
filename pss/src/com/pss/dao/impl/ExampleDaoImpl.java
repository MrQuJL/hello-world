/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IExampleDao;

/**
 * ExampleDao接口实现类
 * @author 曲健磊
 */
public class ExampleDaoImpl extends BaseDao implements IExampleDao {

    @Override
    public void insertExample() {
       System.out.println("增加样例-------dao");
    }
    
}
