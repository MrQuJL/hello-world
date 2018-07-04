/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.ISalesQueryDao;
import com.pss.dao.impl.SalesQueryImpl;
import com.pss.po.SaleQueryMore;
import com.pss.service.ISalesQueryService;
import java.util.List;

/**
 *
 * @author zxc
 */
public class ISalesQueryImpl extends BaseDao implements ISalesQueryService{
    private ISalesQueryDao salesQueryDao=new SalesQueryImpl();
    public List<SaleQueryMore> findSalesQuery(String key) {
        return this.findSalesQuery(key);
    
    }

      
    
    }         
 
