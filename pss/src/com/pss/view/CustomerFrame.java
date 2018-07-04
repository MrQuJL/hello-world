/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.view;

import com.pss.dao.ICustomerDao;
import com.pss.dao.impl.CustomerDaoImpl;
import com.pss.po.Customer;
import com.pss.po.support.Title;
import com.pss.po.support.Title;
import com.pss.util.StringUtil;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 客户资料管理页面
 * @author 张思雨
 */
public class CustomerFrame extends javax.swing.JInternalFrame {
    ICustomerDao cusdao =new CustomerDaoImpl();

    /**
     * Creates new form NewJInternalFrame
     */
    public CustomerFrame() {
        initComponents();
        this.cbxTitle.setModel(new javax.swing.DefaultComboBoxModel(Title.titles));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuery = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        客户编号 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMobilePhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOwner = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDeliverAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxTitle = new javax.swing.JComboBox();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtKey = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("客户管理");

        btnQuery.setText("查询");
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        btnCancel.setText("取消");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "客户编号", "客户姓名", "负责人（称谓）", "电话", "移动电话", "送货地址", "邮编"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("退出");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        客户编号.setText("客户编号：");

        jLabel1.setText("联系电话：");

        jLabel2.setText("客户姓名：");

        jLabel3.setText("移动电话：");

        jLabel4.setText("负责人：");

        jLabel5.setText("邮编：");

        jLabel6.setText("送货地址：");

        jLabel7.setText("负责人称谓：");

        cbxTitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "董事长", "总经理", "项目经理", "财务经理", "人事经理", "销售经理" }));
        cbxTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxTitleMouseClicked(evt);
            }
        });
        cbxTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(客户编号)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustomerID)
                    .addComponent(txtTelephone)
                    .addComponent(cbxTitle, 0, 96, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtDeliverAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtMobilePhone))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtZipCode))))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(客户编号)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMobilePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtDeliverAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInsert.setText("新增");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("更新");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("保存");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel8.setText("客户姓名：");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuery)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuery)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed

        String key=txtKey.getText();
        List<Customer> list =cusdao.findAll(key);     
        refresh(list);    
      
    }//GEN-LAST:event_btnQueryActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        txtOwner.setText("");
        txtTelephone.setText("");
        txtMobilePhone.setText("");
        txtZipCode.setText("");
        txtDeliverAddress.setText("");
        this.cbxTitle.setSelectedIndex(0);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked

        int selectedRow = this.tblCustomer.getSelectedRow();
        this.txtCustomerID.setText((String) this.tblCustomer.getValueAt(selectedRow, 0));
        this.txtCustomerName.setText((String) this.tblCustomer.getValueAt(selectedRow, 1));
        this.txtOwner.setText((String) this.tblCustomer.getValueAt(selectedRow, 2));
        this.txtTelephone.setText((String) this.tblCustomer.getValueAt(selectedRow,3));  
        this.txtMobilePhone.setText((String) this.tblCustomer.getValueAt(selectedRow, 4));
        this.txtZipCode.setText((String) this.tblCustomer.getValueAt(selectedRow, 6));
        this.txtDeliverAddress.setText((String) this.tblCustomer.getValueAt(selectedRow, 5));
       
        String content = (String)this.tblCustomer.getValueAt(selectedRow, 2);
        String ow=null;
		// 从内容上截取路径数组
        Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");  
        Matcher matcher = pattern.matcher(content);
        this.cbxTitle.setSelectedItem(content);
        while(matcher.find()){
          this.cbxTitle.setSelectedItem(matcher.group());
          ow=matcher.group();
        }
        String[] name=content.split(ow);
	String a=name[0].substring(0,name[0].length()-1);
	this.txtOwner.setText(a);

        
        this.btnInsert.setEnabled(true);
        this.btnDelete.setEnabled(true);
        this.btnSave.setEnabled(true);
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     
        String id=this.txtCustomerID.getText().trim();
        String name=this.txtCustomerName.getText().trim();
        String owner=this.txtOwner.getText().trim();
        String title = (String) this.cbxTitle.getSelectedItem();
        String phone=this.txtTelephone.getText().trim();
        String mobile=this.txtMobilePhone.getText().trim();
        String zipCode=this.txtZipCode.getText().trim();
        String deliverAddress=this.txtDeliverAddress.getText().trim();     
        Customer cus=new Customer(id,name,owner,title,phone,mobile,zipCode,deliverAddress);
        if (StringUtil.isEmpty(id) == true) {
            JOptionPane.showMessageDialog(this, "编号不能为空");
            return;
        }
        boolean result = cusdao.saveCustomer(cus);
        if (result) {
            JOptionPane.showMessageDialog(this, "添加成功！");//模态对话框
        } else {
            JOptionPane.showMessageDialog(this, "添加失败！");//模态对话框
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id=this.txtCustomerID.getText().trim();
        boolean result = cusdao.deleteCustomer(id);
         if (result) {
            JOptionPane.showMessageDialog(this, "删除成功！");//模态对话框
            List< Customer> list = cusdao.findAll(id);
            refresh(list);
        } else {
            JOptionPane.showMessageDialog(this, "删除失败！");//模态对话框
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.setVisible(false);
         
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        txtOwner.setText("");   
        txtTelephone.setText("");
        txtMobilePhone.setText("");
        txtZipCode.setText("");
        txtDeliverAddress.setText("");  
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id=this.txtCustomerID.getText().trim();
        String name=this.txtCustomerName.getText().trim();
        String owner=this.txtOwner.getText().trim();
        String title=(String)this.cbxTitle.getSelectedItem();
        String phone=this.txtTelephone.getText().trim();
        String mobile=this.txtMobilePhone.getText().trim();
        String zipCode=this.txtZipCode.getText().trim();
        String deliverAddress=this.txtDeliverAddress.getText().trim();     
        Customer cus=new Customer(id,name,owner,title,phone,mobile,zipCode,deliverAddress);
        boolean result = cusdao.updateCustomer(cus);
        if (result) {
            JOptionPane.showMessageDialog(this, "更新成功！");//模态对话框
        } else {
            JOptionPane.showMessageDialog(this, "更新失败！");//模态对话框
        }
        String key=txtKey.getText();
        List<Customer> list =cusdao.findAll(key);     
        refresh(list); 
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbxTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxTitleMouseClicked
        
    }//GEN-LAST:event_cbxTitleMouseClicked

    private void cbxTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTitleActionPerformed
      
    }//GEN-LAST:event_cbxTitleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnQuery;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbxTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDeliverAddress;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtMobilePhone;
    private javax.swing.JTextField txtOwner;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JLabel 客户编号;
    // End of variables declaration//GEN-END:variables

    private void refresh(List<Customer> list) {
        DefaultTableModel dtm=(DefaultTableModel) this.tblCustomer.getModel();
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        
        for (Customer cus : list) {
            Vector v = new Vector();
            v.add(cus.getId());
            v.add(cus.getName());
            v.add(cus.getOwner() + "("+cus.getTitle()+")");
            v.add(cus.getPhone());
            v.add(cus.getMobile());   
            v.add(cus.getDeliverAddress());
            v.add(cus.getZipCode());
            dtm.addRow(v);

        }

    }
}
