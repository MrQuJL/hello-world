/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IPurchaseDao;
import com.pss.dao.impl.PurchaseDaoImpl;
import com.pss.po.PurchaseDetail;
import com.pss.po.PurchaseInQueryDto;
import com.pss.po.PurchaseMaster;
import com.pss.po.PurchaseQueryDto;
import com.pss.service.IPurchaseService;
import java.util.Date;
import java.util.List;

/**
 *IPurchaseServiceImpl采购服务实现类
 * @author 吴延昭
 */
public class PurchaseServiceImpl implements IPurchaseService{
    IPurchaseDao purchaseDao=new PurchaseDaoImpl();
    
    @Override
    public List<PurchaseQueryDto> queryByDateAndName(Date startTime, Date endTime, String productName) {
        return purchaseDao.queryByDateAndName(startTime, endTime, productName);
    }

    @Override
    public List<PurchaseInQueryDto> queryPurchaseInInfo(String key) {
        return purchaseDao.queryPurchaseInInfo(key);
    }

    @Override
    public Integer insertPurchaseMasterGetId(PurchaseMaster purchaseMaster) {
        int selectedId = purchaseDao.insertPurchaseMasterGetId(purchaseMaster);
        return selectedId;
    }

    @Override
    public boolean insertPurchaseDetail(PurchaseDetail purchaseDetail) {
        return purchaseDao.insertPurchaseDetail(purchaseDetail);
    }
    
}
