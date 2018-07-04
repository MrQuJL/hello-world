/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.dto.InventoryDTO;
import java.util.List;

/**
 * 库存访问接口
 * @author 曲健磊
 */
public interface IInventoryDao {
    
    /**
     * 通过商品名称查询库存
     * @param productName 商品名称
     * @return 
     */
    public List<InventoryDTO> listInventoryByPName(String productName);
    
    /**
     * 通过供应商名称查询库存
     * @param supplierName 供应商名称
     * @return 
     */
    public List<InventoryDTO> listInventoryBySName(String supplierName);
    
}
