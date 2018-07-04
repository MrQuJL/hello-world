/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IDeliverDao;
import com.pss.po.Deliver;

/**
 * 销售dao实现类
 * @author 张琦
 */
public class DeliverDaoImpl extends BaseDao implements IDeliverDao{

    @Override
    public boolean insert(Deliver deliver) {
        String sqlString = "insert into pss_deliver(product_id,sell_unit_price,sell_amount,customer_id,operator_id,deliver_date) values(?,?,?,?,?,?)";
         Object[] params = {deliver.getProductId(),deliver.getSellUnitprice(),deliver.getSellAmount(),deliver.getCustomerId(),deliver.getOpertorId(),deliver.getDeliverDate()};
        return update(sqlString,params);
    }
    
}
