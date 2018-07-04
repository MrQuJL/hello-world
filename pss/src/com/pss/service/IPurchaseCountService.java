/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service;

import com.pss.dto.PurchaseCountDTO;
import java.util.Date;
import java.util.List;

/**
 * PurchaseCount服务接口
 * @author 曲健磊
 */
public interface IPurchaseCountService {
    
    /**
     * 按照商品名称根据日期范围进行分组统计采购记录
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 统计列表
     */
    public List<PurchaseCountDTO> listPurchaseCount(Date startDate, Date endDate);
    
}
