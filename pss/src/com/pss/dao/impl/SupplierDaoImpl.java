/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.ISupplierDao;
import com.pss.po.Supplier;

import java.util.List;

/**
 *
 * @author 李振
 */
public class SupplierDaoImpl extends BaseDao implements ISupplierDao{

    @Override
    public boolean addSupplier(Supplier supplier) {
        String sqlString ="insert into pss_supplier(id,simple_name,full_name,owner,title,phone,mobile,fax,supplier_address,factory_address) values(?,?,?,?,?,?,?,?,?,?)";
        Object[] params={supplier.getId(),supplier.getSimplieName(),supplier.getFullName(),supplier.getOwner(),supplier.getTitle(),supplier.getPhone(),supplier.getMobile(),supplier.getFax(),supplier.getSupplierAddress(),supplier.getFactoryAddress()};
         return this.update(sqlString, params);
    
    }

    @Override
    public boolean delSupplier(String id) {
        String sqlString="delete from pss_supplier where id=?";
        Object[] params={id};
         return this.update(sqlString, params);
        }

    @Override
    public boolean updateSuplier(Supplier supplier) {
         String sqlString="update pss_supplier set simple_name=?,full_name=?,owner=?,title=?,phone=?,mobile=?,fax=?,supplier_address=?,factory_address=? where id=?";
         Object[] params={supplier.getSimplieName(),supplier.getFullName(),supplier.getOwner(),supplier.getTitle(),supplier.getPhone(),supplier.getMobile(),supplier.getFax(),supplier.getSupplierAddress(),supplier.getFactoryAddress(),supplier.getId()};
         return this.update(sqlString, params);
    }

    @Override
    public List<Supplier> querySupplier(String key) {
        String sqlString="select id, simple_name simplieName, full_name fullName, " +
            "owner, title, phone, mobile, fax, supplier_address supplierAddress, " +
            "factory_address factoryAddress " +
            "from pss_supplier ";
          if(key!=null && !key.equals(""))
         {
             sqlString+=" where concat(id,simple_name,full_name,owner,title,phone,mobile,fax,supplier_address,factory_address) like '%"+key+"%'";
         }
    return this.query(sqlString, Supplier.class);
    }

}
