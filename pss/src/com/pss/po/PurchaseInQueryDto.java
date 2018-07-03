/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 *
 * @author BiGSon
 */
public class PurchaseInQueryDto {
    private String productId;
    private String productName;
    private String supplierId;
    private String supplierName;
    private double productSpp;

    public PurchaseInQueryDto(String productId, String productName, String supplierId, String supplierName, double productSpp) {
        this.productId = productId;
        this.productName = productName;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.productSpp = productSpp;
    }

    public PurchaseInQueryDto() {
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public double getProductSpp() {
        return productSpp;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setProductSpp(double productSpp) {
        this.productSpp = productSpp;
    }
    
}
