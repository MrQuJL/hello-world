/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IPurchaseCountDao;
import com.pss.dao.impl.PurchaseCountDaoImpl;
import com.pss.dto.PurchaseCountDTO;
import com.pss.service.IPurchaseCountService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * IPurchaseCountService实现类
 * @author 曲健磊
 */
public class PurchaseCountServiceImpl implements IPurchaseCountService {
    private IPurchaseCountDao purchaseCount = new PurchaseCountDaoImpl();
    
    @Override
    public List<PurchaseCountDTO> listPurchaseCount(Date startDate, Date endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sD = sdf.format(startDate);
        String eD = sdf.format(endDate);
        return purchaseCount.listPurchaseCount(sD, eD);
    }
    
}
