/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dao;

import com.pss.dto.ProductSupplierDTO;
import java.util.List;

/**
 *
 * @author 张琦
 */
public interface IProductSupplierDao {
     public List<ProductSupplierDTO> findAll(String str);
      public List<ProductSupplierDTO> findById(ProductSupplierDTO ps);
}
