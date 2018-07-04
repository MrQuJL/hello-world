/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.dto;

/**
 * 商品加供应商的实体类
 * @author 张琦
 */
public class ProductSupplierDTO {
    private String id;
    private String name;
    private int purchaseAmount;
    private double suggestSellPrice;
    private String supplierId;
    private String simplieName;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

   

    /**
     * @return the suggestSellPrice
     */
    public double getSuggestSellPrice() {
        return suggestSellPrice;
    }

    /**
     * @param suggestSellPrice the suggestSellPrice to set
     */
    public void setSuggestSellPrice(double suggestSellPrice) {
        this.suggestSellPrice = suggestSellPrice;
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
     * @return the simplieName
     */
    public String getSimplieName() {
        return simplieName;
    }

    /**
     * @param simplieName the simplieName to set
     */
    public void setSimplieName(String simplieName) {
        this.simplieName = simplieName;
    }

    /**
     * @return the purchaseAmount
     */
    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * @param purchaseAmount the purchaseAmount to set
     */
    public void setPurchaseAmount(int purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
