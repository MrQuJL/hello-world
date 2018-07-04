/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.po;

/**
 *
 * @author zxc
 */
public class SaleQueryMore {
    private String  deliver_id;
    private String name;
    private int  sell_amount;
    private  int sell_unit_price;
    private int salemoney;
    private String customer_name;

    /**
     * @return the deliver_id
     */
    public String getDeliver_id() {
        return deliver_id;
    }

    /**
     * @param deliver_id the deliver_id to set
     */
    public void setDeliver_id(String deliver_id) {
        this.deliver_id = deliver_id;
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
     * @return the sell_amount
     */
    public int getSell_amount() {
        return sell_amount;
    }

    /**
     * @param sell_amount the sell_amount to set
     */
    public void setSell_amount(int sell_amount) {
        this.sell_amount = sell_amount;
    }

    /**
     * @return the sell_unit_price
     */
    public int getSell_unit_price() {
        return sell_unit_price;
    }

    /**
     * @param sell_unit_price the sell_unit_price to set
     */
    public void setSell_unit_price(int sell_unit_price) {
        this.sell_unit_price = sell_unit_price;
    }

    /**
     * @return the salemoney
     */
    public int getSalemoney() {
        return salemoney;
    }

    /**
     * @param salemoney the salemoney to set
     */
    public void setSalemoney(int sell_amount,int sell_unit_price) {
        this.salemoney = sell_unit_price*sell_amount;
    }

    /**
     * @return the customer_name
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * @param customer_name the customer_name to set
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }


    
    
}
