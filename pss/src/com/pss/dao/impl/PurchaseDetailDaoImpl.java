/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IPurchaseDetailDao;

/**
 *
 * @author 张琦
 */
public class PurchaseDetailDaoImpl extends BaseDao implements IPurchaseDetailDao{

    @Override
    public boolean updatecount(int num,String id) {
        String sqlString = "update pss_purchase_detail set purchase_amount =purchase_amount- ? where product_id=?";
        Object[] params = {num,id};
        return update(sqlString, params);
    }
    
}
