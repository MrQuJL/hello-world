/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 * 销售单实体类
 * @author 张琦
 */
public class Deliver {
    private int deliverId;
    private String productId;
    private String sellUnitprice;
    private String sellAmount;
    private String customerId;
    private String opertorId;
    private String deliverDate; 
    public Deliver(String productId,String sellUnitprice,String sellAmount,String customerId,String opertorId,String deliverDate){
        this.productId=productId;
        this.sellUnitprice=sellUnitprice;
        this.sellAmount=sellAmount;
        this.customerId=customerId;
        this.opertorId=opertorId;
        this.deliverDate=deliverDate;
    }
    
    public Deliver(){}

    /**
     * @return the deliverId
     */
    public int getDeliverId() {
        return deliverId;
    }

    /**
     * @param deliverId the deliverId to set
     */
    public void setDeliverId(int deliverId) {
        this.deliverId = deliverId;
    }

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
     * @return the sellUnitprice
     */
    public String getSellUnitprice() {
        return sellUnitprice;
    }

    /**
     * @param sellUnitprice the sellUnitprice to set
     */
    public void setSellUnitprice(String sellUnitprice) {
        this.sellUnitprice = sellUnitprice;
    }

    /**
     * @return the sellAmount
     */
    public String getSellAmount() {
        return sellAmount;
    }

    /**
     * @param sellAmount the sellAmount to set
     */
    public void setSellAmount(String sellAmount) {
        this.sellAmount = sellAmount;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the opertorId
     */
    public String getOpertorId() {
        return opertorId;
    }

    /**
     * @param opertorId the opertorId to set
     */
    public void setOpertorId(String opertorId) {
        this.opertorId = opertorId;
    }

    /**
     * @return the deliverDate
     */
    public String getDeliverDate() {
        return deliverDate;
    }

    /**
     * @param deliverDate the deliverDate to set
     */
    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }
    
}
