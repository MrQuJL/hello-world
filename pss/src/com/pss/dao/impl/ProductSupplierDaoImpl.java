/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IProductSupplierDao;
import com.pss.dto.ProductSupplierDTO;
import java.util.List;

/**
 * 
 * @author 张琦
 */
public class ProductSupplierDaoImpl extends BaseDao implements IProductSupplierDao{

    @Override
    public List<ProductSupplierDTO> findAll(String str) {
        String sqlString = "select p.id as id,p.name as name,p.suggest_sell_price as suggestSellPrice,pd.purchase_amount as purchaseAmount,p.supplier_id as supplierId,s.simple_name as simplieName from pss_product as p,pss_supplier as s,pss_purchase_detail pd where p.supplier_id = s.id and p.id=pd.product_id";
        sqlString +=" and p.name like ?";
        return query(sqlString, ProductSupplierDTO.class,"%"+str+"%");
    }

    @Override
    public List<ProductSupplierDTO> findById(ProductSupplierDTO ps) {
       String sqlString = "select p.id as id,p.name as name,pd.purchase_amount as purchaseAmount from pss_product as p,pss_supplier as s,pss_purchase_detail pd where p.supplier_id = s.id and p.id=pd.product_id";
        sqlString +=" and p.id=?";
        Object[] params = {ps.getId()};
        return query(sqlString, ProductSupplierDTO.class,params);
    }
    
}
