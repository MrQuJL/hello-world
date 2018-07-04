/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IInventoryDao;
import com.pss.dao.impl.InventoryDaoImpl;
import com.pss.dto.InventoryDTO;
import com.pss.service.IInventoryService;
import java.util.List;

/**
 * IInventoryService接口的实现类
 * @author 曲健磊
 */
public class InventoryServiceImpl implements IInventoryService {
    private IInventoryDao inventoryDao = new InventoryDaoImpl();
    
    @Override
    public List<InventoryDTO> listInventoryByPName(String productName) {
        return inventoryDao.listInventoryByPName(productName);
    }

    @Override
    public List<InventoryDTO> listInventoryBySName(String supplierName) {
        return inventoryDao.listInventoryBySName(supplierName);
    }
    
}
