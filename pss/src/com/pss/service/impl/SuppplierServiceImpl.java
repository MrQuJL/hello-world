/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.ISupplierDao;
import com.pss.dao.impl.SupplierDaoImpl;
import com.pss.po.Supplier;

import com.pss.service.ISupplierService;
import java.util.List;

/**
 *
 * @author lz
 */
public class SuppplierServiceImpl implements ISupplierService{
  private  ISupplierDao supplierDao=new SupplierDaoImpl();
    @Override
    public boolean addSupplier(Supplier supplier) {
        
       return supplierDao.addSupplier(supplier);
    
    }

    @Override
    public boolean delSupplier(String id) {
      return supplierDao.delSupplier(id);
    
    }

    @Override
    public boolean updateSuplier(Supplier supplier) {
       return supplierDao.updateSuplier(supplier);
    
    }

    @Override
    public List<Supplier> querySupplier(String key) {
      return supplierDao.querySupplier(key);
    
    }

 
    
}
