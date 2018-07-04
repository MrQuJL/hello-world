/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.ICustomerDao;
import com.pss.po.Customer;
import java.util.List;

/**
 *
 * @author 张思雨
 */
public  class CustomerDaoImpl extends BaseDao implements ICustomerDao{

    @Override
    public boolean insertCustomer(Customer cus) {
        return false;
        
    }

    @Override
    public boolean deleteCustomer(String id) {
      	String sqlString = "delete from pss_customer where id=?";
	Object[] params = {id};
	return update(sqlString, params);
    }

    @Override
    public boolean updateCustomer(Customer cus) {
       String sqlString = "update pss_customer set id=?,name=?,owner=?,title=?,phone=?,mobile=?,zip_Code=?,deliver_Address=? where id=?";
		Object[] params = {cus.getId(),cus.getName(),cus.getOwner(),cus.getTitle(),cus.getPhone(),cus.getMobile(),cus.getZipCode(),cus.getDeliverAddress(),cus.getId()};
		return update(sqlString, params);
    }

    @Override
    public List<Customer> findAll() {
        String sqlString = "select id,name,owner,title,phone,mobile,zip_code as zipCode,deliver_address as deliverAddress from pss_customer";
        return query(sqlString, Customer.class);
    }
    
    @Override
    public List<Customer> findAll(String key) {
        String sqlString = "select id,name,owner,title,phone,mobile,zip_code as zipCode,deliver_address as deliverAddress from pss_customer where name like ?";
        return query(sqlString, Customer.class,"%"+key+"%");        

    }

    @Override
    public boolean saveCustomer(Customer cus) {
         String sqlString = "insert into pss_customer(id,name,owner,title,phone,mobile,zip_code,deliver_address) values(?,?,?,?,?,?,?,?)";
		Object[] params = {cus.getId(),cus.getName(),cus.getOwner(),cus.getTitle(),cus.getPhone(),cus.getMobile(),cus.getZipCode(),cus.getDeliverAddress()};
		return update(sqlString,  params); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exitCustomer() {
        return false;
    }

    @Override
    public boolean cancelCustomer() {
        return false;
    }
       
   
}
