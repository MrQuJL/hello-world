/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IPurchaseCountDao;
import com.pss.dto.PurchaseCountDTO;
import java.util.List;

/**
 * IPurchaseCountDao的实现类
 * @author 曲健磊
 */
public class PurchaseCountDaoImpl extends BaseDao implements IPurchaseCountDao {

    @Override
    public List<PurchaseCountDTO> listPurchaseCount(String startDate, String endDate) {
        String sql = "SELECT A.product_id productId, C.`name` productName, SUM(A.purchase_amount) purchaseAmount, " +
            "SUM(A.purchase_unit_price * A.purchase_amount) as purchaseMoney " +
            "FROM pss_purchase_detail A, pss_purchase_master B, " +
            "pss_product C " +
            "WHERE A.purchase_id = B.id AND A.product_id = C.id " +
            "AND B.purchase_date BETWEEN ? AND ? " +
            "GROUP BY C.name";
        Object[] params = {startDate, endDate};
        List<PurchaseCountDTO> list = this.query(sql, PurchaseCountDTO.class, params);
        return list;
    }
    
}
