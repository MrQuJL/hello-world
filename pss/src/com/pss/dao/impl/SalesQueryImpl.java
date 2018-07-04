                     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.ISalesQueryDao;
import com.pss.po.SaleQueryMore;

import java.util.List;

/**
 *SalesQu    select deliver_id,p.name,sell_amount,sell_unit_price,c.name from pss_deliver as d " +
"LEFT JOIN pss_customer c on d.customer_id=c.id " +
"LEFT JOIN pss_product p on d.product_id=p.id
 * @author 赵学成
 */
public class SalesQueryImpl extends BaseDao implements ISalesQueryDao {
     public List<SaleQueryMore> findSalesQuery(String startDate, String endDate, String key) {
           String sqlString = "select deliver_id,p.name,sell_amount,sell_unit_price,c.name customer_name" +
              " from pss_deliver as d LEFT JOIN pss_customer c on d.customer_id=c.id  " +
              "LEFT JOIN pss_product p on d.product_id=p.id " +
              "WHERE d.deliver_date BETWEEN  ?  AND ?   " +
              "AND p.`name` like ? ";
           Object[] params = {startDate, endDate, "%"+key+"%"};
           List<SaleQueryMore> list = this.query(sqlString,  SaleQueryMore.class,  params);
           return list;
      }
}

    
