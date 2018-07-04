/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service;

import com.pss.po.SaleQueryMore;
import java.util.List;

/**
 *
 * @author zxc
 */
public interface ISalesQueryService {
     public List<SaleQueryMore> findSalesQuery(String key);
}
