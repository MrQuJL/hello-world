/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 * 采购从表
 * @author 吴延昭
 * @author 张琦
 */
public class PurchaseDetail {
    private int purchaseId;
    private String productId;
    private float purchaseUnitPrice;
    private int purchaseAmount;

    public PurchaseDetail() {
    }

    public PurchaseDetail(int purchaseId, String productId, float purchaseUnitPrice, int purchaseAmount) {
        this.purchaseId = purchaseId;
        this.productId = productId;
        this.purchaseUnitPrice = purchaseUnitPrice;
        this.purchaseAmount = purchaseAmount;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public String getProductId() {
        return productId;
    }

    public float getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPurchaseUnitPrice(float purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    
}
