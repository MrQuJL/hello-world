/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service;

import com.pss.po.PurchaseInQueryDto;
import com.pss.po.PurchaseQueryDto;
import java.util.Date;
import java.util.List;

/**
 *IPurchaseService采购服务类
 * @author 吴延昭
 */
public interface IPurchaseService {
    public List<PurchaseQueryDto> queryByDateAndName(Date startTime,Date endTime,String productName);
    public List<PurchaseInQueryDto> queryPurchaseInInfo(String key);
}
