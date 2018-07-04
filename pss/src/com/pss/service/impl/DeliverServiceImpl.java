/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.service.impl;

import com.pss.dao.IDeliverDao;
import com.pss.dao.impl.DeliverDaoImpl;
import com.pss.service.IDeliverService;

/**
 *
 * @author 张琦
 */
public class DeliverServiceImpl implements IDeliverService{
    private IDeliverDao dao=new DeliverDaoImpl();
}
