/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.po.SaleQueryMore;

import java.util.List;

/**
 *
 * @author zxc
 */
public interface ISalesQueryDao {
    
     public List<SaleQueryMore> findSalesQuery(String startDate, String endDate, String key);
    
}
