/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dto;

import java.util.Date;

/**
 * 库存实体
 * @author 曲健磊
 */
public class InventoryDTO {
    private String productId;
    private String productName;
    private Integer purchaseAmount;
    private Integer safeStock;
    private Double spprice;
    private Date spdate;
    private Double sSellPrice;
    private Date deliverDate;
    private String supplierId;
    private String supplierName;

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
     * @return the safeStock
     */
    public Integer getSafeStock() {
        return safeStock;
    }

    /**
     * @param safeStock the safeStock to set
     */
    public void setSafeStock(Integer safeStock) {
        this.safeStock = safeStock;
    }

    /**
     * @return the spprice
     */
    public Double getSpprice() {
        return spprice;
    }

    /**
     * @param spprice the spprice to set
     */
    public void setSpprice(Double spprice) {
        this.spprice = spprice;
    }

    /**
     * @return the spdate
     */
    public Date getSpdate() {
        return spdate;
    }

    /**
     * @param spdate the spdate to set
     */
    public void setSpdate(Date spdate) {
        this.spdate = spdate;
    }

    /**
     * @return the sSellPrice
     */
    public Double getsSellPrice() {
        return sSellPrice;
    }

    /**
     * @param sSellPrice the sSellPrice to set
     */
    public void setsSellPrice(Double sSellPrice) {
        this.sSellPrice = sSellPrice;
    }

    /**
     * @return the deliverDate
     */
    public Date getDeliverDate() {
        return deliverDate;
    }

    /**
     * @param deliverDate the deliverDate to set
     */
    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the supplierName
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * @param supplierName the supplierName to set
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
}
