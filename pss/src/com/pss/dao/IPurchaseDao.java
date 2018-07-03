/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.po.PurchaseInQueryDto;
import com.pss.po.PurchaseQueryDto;
import java.util.Date;
import java.util.List;

/**
 *采购IPurchaseDao
 * @author 吴延昭
 */
public interface IPurchaseDao {
    public List<PurchaseQueryDto> queryByDateAndName(Date startTime,Date endTime,String productName);
    public List<PurchaseInQueryDto> queryPurchaseInInfo(String key);
}
