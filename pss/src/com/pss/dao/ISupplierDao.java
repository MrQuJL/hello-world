/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.po.Supplier;

import java.util.List;

/**
 * 供应商数据访问接口
 * @author 李振
 */
public interface ISupplierDao {
    
    public boolean addSupplier(Supplier supplier);
    
    public boolean delSupplier(String id);
    
    public boolean updateSuplier(Supplier supplier);
   
    public List<Supplier> querySupplier(String key);

}
