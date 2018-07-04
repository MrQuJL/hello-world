/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 * 客户实体类
 * @author 张思雨
 * @author 张琦
 */
public class Customer {
    private String id;
    private String name;
    private String owner;
    private String title;
    private String phone;
    private String mobile;
    private String zipCode;
    private String deliverAddress;
    public Customer(String id,String name, String owner,String title,String phone,String mobile,String zipCode,String deliverAddress){
        this.id=id;
        this.name=name;
        this.owner=owner;
        this.title=title;
        this.phone=phone;
        this.mobile=mobile;
        this.zipCode=zipCode;
        this.deliverAddress=deliverAddress;
    }
    public Customer(){}

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
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the deliverAddress
     */
    public String getDeliverAddress() {
        return deliverAddress;
    }

    /**
     * @param deliverAddress the deliverAddress to set
     */
    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }
    
    @Override
    public String toString() {
	return name;
    }
}
