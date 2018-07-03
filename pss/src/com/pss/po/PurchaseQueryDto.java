/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

import java.util.Date;

/**
 *PurchaseQueryDto采购查询实体类
 * @author 吴延昭
 */
public class PurchaseQueryDto {
    private String purchaseId;  
    private String productName;
    private int purchaseAmount;
    private double purchaseUnitPrice;
    private double purchaseTotalPrice;
    private String supplierName;
    private Date purchaserDate;
    private String operatorId;
    private String operatorName;

    public PurchaseQueryDto() {
    }

    public PurchaseQueryDto(String purchaseId, String productName, int purchaseAmount, double purchaseUnitPrice, double purchaseTotalPrice, String supplierName, Date purchaserDate, String operatorId, String operatorName) {
        this.purchaseId = purchaseId;
        this.productName = productName;
        this.purchaseAmount = purchaseAmount;
        this.purchaseUnitPrice = purchaseUnitPrice;
        this.purchaseTotalPrice = purchaseTotalPrice;
        this.supplierName = supplierName;
        this.purchaserDate = purchaserDate;
        this.operatorId = operatorId;
        this.operatorName = operatorName;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    

    public String getPurchaseId() {
        return purchaseId;
    }

    public String getProductName() {
        return productName;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    public double getPurchaseUnitPrice() {
        return purchaseUnitPrice;
    }

    public double getPurchaseTotalPrice() {
        return purchaseTotalPrice;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Date getPurchaserDate() {
        return purchaserDate;
    }

    

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void setPurchaseUnitPrice(double purchaseUnitPrice) {
        this.purchaseUnitPrice = purchaseUnitPrice;
    }

    public void setPurchaseTotalPrice(double purchaseTotalPrice) {
        this.purchaseTotalPrice = purchaseTotalPrice;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setPurchaserDate(Date purchaserDate) {
        this.purchaserDate = purchaserDate;
    }

   
    
}
