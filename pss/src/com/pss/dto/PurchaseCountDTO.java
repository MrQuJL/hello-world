/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dto;

/**
 * 采购统计实体类
 * @author 曲健磊
 */
public class PurchaseCountDTO {
    private String productId;
    private String productName;
    private Integer purchaseAmount;
    private Double purchaseMoney;

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the purchaseAmount
     */
    public Integer getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * @param purchaseAmount the purchaseAmount to set
     */
    public void setPurchaseAmount(Integer purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * @return the purchaseMoney
     */
    public Double getPurchaseMoney() {
        return purchaseMoney;
    }

    /**
     * @param purchaseMoney the purchaseMoney to set
     */
    public void setPurchaseMoney(Double purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }
    
}
