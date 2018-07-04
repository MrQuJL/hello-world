/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.dto.ProductMore;
import com.pss.po.Product;
import java.util.List;

/**
 * 商品dao接口
 * @author 李振
 * @author 张琦
 */
public interface IProductDao {
    public boolean addProduct(Product product);
    
    public boolean delProduct(String id);
    
    public boolean updateProduct(Product product);
    
    public List<ProductMore> queryProduct(String key);
    
    public List<Product> findAll(String str);
}
