/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service;

import com.pss.po.Supplier;

import java.util.List;

/**
 *
 * @author lz
 */
public interface ISupplierService {
    public boolean addSupplier(Supplier supplier);
    public boolean delSupplier(String id);
    public boolean updateSuplier(Supplier supplier);
    public List<Supplier> querySupplier(String key);

    
}
