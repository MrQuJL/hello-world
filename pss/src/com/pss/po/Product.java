/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 *
 * 商品实体类
 * @author 李振
 * @author 张琦
 */
public class Product {
    
    private String id;
    private String name;
    private int safeStock;
    private double suggestPurchasePrice;
    private double suggestSellPrice;
    private String supplierId;
    private String remark;

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
     * @return the safeStock
     */
    public int getSafeStock() {
        return safeStock;
    }

    /**
     * @param safeStock the safeStock to set
     */
    public void setSafeStock(int safeStock) {
        this.safeStock = safeStock;
    }

    /**
     * @return the suggestPurchasePrice
     */
    public double getSuggestPurchasePrice() {
        return suggestPurchasePrice;
    }

    /**
     * @param suggestPurchasePrice the suggestPurchasePrice to set
     */
    public void setSuggestPurchasePrice(double suggestPurchasePrice) {
        this.suggestPurchasePrice = suggestPurchasePrice;
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
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
