/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IPurchaseDao;
import com.pss.po.PurchaseInQueryDto;
import com.pss.po.PurchaseQueryDto;
import java.util.Date;
import java.util.List;

/**
 * PurchaseDaoImpl类
 *
 * @author 吴延昭
 */
public class PurchaseDaoImpl extends BaseDao implements IPurchaseDao {

    @Override
    public List<PurchaseQueryDto> queryByDateAndName(Date startTime, Date endTime, String productName) {
        String sql = "SELECT * FROM(\n"
                + "SELECT  \n"
                + "	pss_purchase_master.id as purchaseId, \n"
                + "	pss_product.`name`  as productName,\n"
                + "	pss_purchase_detail.purchase_amount as purchaseAmount,\n"
                + "  pss_purchase_detail.purchase_unit_price as purchaseUnitPrice,\n"
                + "  pss_purchase_detail.purchase_amount * pss_purchase_detail.purchase_unit_price as purchaseTotalPrice,\n"
                + "  pss_supplier.simple_name as supplierName,\n"
                + "	pss_purchase_master.purchase_date as purchaserDate,\n"
                + "  pss_purchase_master.operator_id as operatorId, \n"
                + "	pss_user.real_name as operatorName\n"
                + "from pss_purchase_master left outer join pss_purchase_detail \n"
                + "on pss_purchase_master.id = pss_purchase_detail.purchase_id \n"
                + "left outer join pss_product on pss_purchase_detail.product_id = pss_product.id \n"
                + "left outer join pss_supplier on pss_product.supplier_id = pss_supplier.id \n"
                + "left outer join pss_user on pss_purchase_master.operator_id = pss_user.user_no \n"
                + ") as resultTable where purchaserDate BETWEEN ? AND ? AND productName LIKE ?\n"
                + "\n"
                + "";
        Object[] params = {startTime, endTime, "%" + productName + "%"};
        return this.query(sql, PurchaseQueryDto.class, params);
    }

    @Override
    public List<PurchaseInQueryDto> queryPurchaseInInfo(String key) {
        String sql = "SELECT * FROM\n"
                + "(SELECT \n"
                + "	pss_product.id as productId,\n"
                + "	pss_product.`name` as productName,\n"
                + "	pss_supplier.id as supplierId,\n"
                + "	pss_supplier.simple_name as supplierName,\n"
                + "	pss_product.suggest_purchase_price as productSpp\n"
                + "FROM \n"
                + "pss_product LEFT OUTER JOIN pss_supplier on pss_product.supplier_id=pss_supplier.id) resultTable\n"
                + "where CONCAT(productName,supplierName) LIKE ?";
        Object[] params={"%"+key+"%"};
        return this.query(sql, PurchaseInQueryDto.class,params);
    }

}
