/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.dto.PurchaseCountDTO;
import java.util.List;

/**
 * 用于采购统计的dao接口
 * @author 曲健磊
 */
public interface IPurchaseCountDao {
    
    /**
     * 按照商品名称根据日期范围进行分组统计采购记录
     * @return 
     */
    public List<PurchaseCountDTO> listPurchaseCount(String startDate, String endDate);
    
}
