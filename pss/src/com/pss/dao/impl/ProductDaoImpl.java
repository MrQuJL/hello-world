/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao.impl;

import com.pss.dao.BaseDao;
import com.pss.dao.IProductDao;
import com.pss.dto.ProductMore;
import com.pss.po.Product;
import java.util.List;

/**
 * 商品Dao访问接口
 * @author 李振
 */
public class ProductDaoImpl  extends BaseDao implements IProductDao{

    @Override
    public boolean addProduct(Product product) {
       String sqlString ="insert into pss_product(id,name,safe_stock,suggest_purchase_price,suggest_sell_price,supplier_id) values(?,?,?,?,?,?)";
        Object[] params={product.getId(),product.getName(),product.getSafeStock(),product.getSuggestPurchasePrice() ,product.getSuggestSellPrice(),product.getSupplierId()};
         return this.update(sqlString, params);
    
    }

    @Override
    public boolean delProduct(String id) {
         String sqlString="delete from pss_product where id=?";
        Object[] params={id};
         return this.update(sqlString, params);
    }

    @Override
    public boolean updateProduct(Product product) {
         String sqlString="update pss_product set name=?,safe_stock=?,suggest_purchase_price=?,suggest_sell_price=?,supplier_id=? where id=?";
          Object[] params={product.getName(),product.getSafeStock(),product.getSuggestPurchasePrice(),product.getSuggestSellPrice(),product.getSupplierId(),product.getId()};
         return this.update(sqlString, params);
    }

    @Override
    public List<ProductMore> queryProduct(String key) {
          String sqlString="SELECT pss_product.id,name,safe_stock safeStock,suggest_purchase_price suggestPurchasePrice,suggest_sell_price suggestSellPrice,supplier_id supplierId,full_name fullName FROM pss_product LEFT OUTER JOIN pss_supplier ON pss_product.supplier_id=pss_supplier.id";
          if(key!=null && !key.equals(""))
         {
             sqlString+=" where concat(pss_product.id,name,safe_stock,suggest_purchase_price,suggest_sell_price,supplier_id) like '%"+key+"%'";
         }
    return this.query(sqlString, ProductMore.class);
    }
    
    @Override
    public List<Product> findAll(String str) {    
	String sqlString = "select p.id,p.name,p.suggest_sell_price,p.safe_stock,p.supplier_id,s.simple_name from pss_product as p,pss_supplier as s where p.supplier_id = s.id";
        sqlString +=" where p.name like ?";
        return query(sqlString, Product.class,"%"+str+"%");
    }
    
}
