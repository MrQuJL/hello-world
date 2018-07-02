/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.util;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 * 用于生成内部窗体的工具类
 * @author 曲健磊
 */
public class FrameUtil {
    
    /**
     * 存放已生成的内部窗体
     */
    public static HashMap<String,JInternalFrame> framemap = new HashMap<String,JInternalFrame>();

    /**
     * 根据指定的键值生成对应的内部窗体对象
     * @param clazz
     * @return 内部窗体对象
     */
    public static JInternalFrame buildFrame(Class clazz){
        JInternalFrame  inFrame = null;//初始化内部窗体
        if(framemap.containsKey(clazz.getName())==true){ // 已经创建了一个窗体
            inFrame = framemap.get(clazz.getName());
        }else{
            try {
                //集合中没有就通过反射创建一个
                inFrame = (JInternalFrame) clazz.newInstance();
                 //添加到集合(类名，内部窗体对象)
                framemap.put(clazz.getName(), inFrame);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(FrameUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return inFrame;
    }
}
