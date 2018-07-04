/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

import java.util.Date;

/**
 *采购主表
 * @author 吴延昭
 */
public class PurchaseMaster {
    private int id;
    private Date purchaseDate;
    private String operatorId;

    public PurchaseMaster() {
    }

    public PurchaseMaster(int id, Date purchaseDate, String operatorId) {
        this.id = id;
        this.purchaseDate = purchaseDate;
        this.operatorId = operatorId;
    }

    public int getId() {
        return id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    
}
