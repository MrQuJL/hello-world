/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dto;

import com.pss.po.Product;

/**
 * 包含供应商名称的商品实体类
 * @author 李振
 */
public class ProductMore extends Product{
    private String fullName;

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
