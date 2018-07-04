/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service;

import com.pss.dto.ProductMore;
import com.pss.po.Product;
import java.util.List;

/**
 *
 * @author 李振
 */
public interface IProductService {
    
    public boolean addProduct(Product product);
    
    public boolean delProduct(String id);
    
    public boolean updateProduct(Product product);
    
    public List<ProductMore> queryProduct(String key);
    
}
