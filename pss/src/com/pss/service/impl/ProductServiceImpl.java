/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IProductDao;
import com.pss.dao.impl.ProductDaoImpl;
import com.pss.dto.ProductMore;
import com.pss.po.Product;
import com.pss.service.IProductService;
import java.util.List;

/**
 *
 * @author lz
 */
public class ProductServiceImpl  implements IProductService {
    private final IProductDao productDao=new ProductDaoImpl();

    @Override
    public boolean addProduct(Product product) {
       return productDao.addProduct(product);
    }

    @Override
    public boolean delProduct(String id) {
        return productDao.delProduct(id);
    }

    @Override
    public boolean updateProduct(Product product) {
      return productDao.updateProduct(product);
    }

    @Override
    public List<ProductMore> queryProduct(String key) {
        return productDao.queryProduct(key);
    }
    
    
}
