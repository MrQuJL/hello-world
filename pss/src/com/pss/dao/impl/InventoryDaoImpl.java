/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IInventoryDao;
import com.pss.dto.InventoryDTO;
import java.util.List;

/**
 * IInventoryDao的实现类
 * @author 曲健磊
 */
public class InventoryDaoImpl extends BaseDao implements IInventoryDao {

    @Override
    public List<InventoryDTO> listInventoryByPName(String productName) {
        String sql = "SELECT B.product_id productId, C.name productName," +
            "B.purchase_amount purchaseAmount, C.safe_stock safeStock," +
            "C.suggest_purchase_price spprice, A.purchase_date spdate," +
            "C.suggest_sell_price sSellPrice, E.deliver_date deliverDate," +
            "C.supplier_id supplierId, D.full_name supplierName " +
            "FROM pss_purchase_master A, pss_purchase_detail B," +
            "pss_product C, pss_supplier D, pss_deliver E " +
            "WHERE A.id = B.purchase_id AND B.product_id = C.id " +
            "AND C.supplier_id = D.id AND E.product_id = B.product_id " +
            "AND C.name LIKE ? ";
        List<InventoryDTO> inventoryList = this.query(sql, InventoryDTO.class, "%"+productName+"%");
        return inventoryList;
    }

    @Override
    public List<InventoryDTO> listInventoryBySName(String supplierName) {
        String sql = "SELECT B.product_id productId, C.`name` productName," +
            "B.purchase_amount purchaseAmount, C.safe_stock safeStock," +
            "C.suggest_purchase_price spprice, A.purchase_date spdate," +
            "C.suggest_sell_price sSellPrice, E.deliver_date deliverDate," +
            "C.supplier_id supplierId, D.full_name supplierName " +
            "FROM pss_purchase_master A, pss_purchase_detail B, " +
            "pss_product C, pss_supplier D, pss_deliver E " +
            "WHERE A.id = B.purchase_id AND B.product_id = C.id " +
            "AND C.supplier_id = D.id AND E.product_id = B.product_id " +
            "AND D.full_name LIKE ?";
        List<InventoryDTO> inventoryList = this.query(sql, InventoryDTO.class, "%"+supplierName+"%");
        return inventoryList;
    }
    
}
