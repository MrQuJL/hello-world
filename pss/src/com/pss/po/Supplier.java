/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 * 供应商实体类
 * @author 李振
 * @author 张琦
 */
public class Supplier {
    private String id;
    private String simplieName;
    private String fullName;
    private String owner;
    private String title;
    private String phone;
    private String mobile;
    private String fax;
    private String supplierAddress;
    private String factoryAddress;

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

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the supplierAddress
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * @param supplierAddress the supplierAddress to set
     */
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    /**
     * @return the factoryAddress
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * @param factoryAddress the factoryAddress to set
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }
    
    @Override
    public String toString() {
        return this.fullName;
    }
    
}
