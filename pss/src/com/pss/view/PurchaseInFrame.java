/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.view;

import com.pss.po.PurchaseInQueryDto;
import com.pss.service.IPurchaseService;
import com.pss.service.impl.PurchaseServiceImpl;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * 采购入库页面
 *
 * @author 吴延昭
 */
public class PurchaseInFrame extends javax.swing.JInternalFrame {

    IPurchaseService purchaseService = new PurchaseServiceImpl();
    List<PurchaseInQueryDto> list = null;

    /**
     * Creates new form PurchaseInFrame
     */
    public PurchaseInFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnQuery = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGoods = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddToPurchase = new javax.swing.JTable();
        btnPurchaseIn = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("采购入库");

        btnQuery.setText("查询");
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        tblGoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "商品编号", "商品名称", "供应商编号", "供应商名称", "建议采购价"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGoods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGoodsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGoods);

        jLabel1.setText("加入采购：");

        tblAddToPurchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "商品编号", "商品名称", "供应商", "建议购买价", "采购量", "采购价格", "总价"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAddToPurchase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblAddToPurchaseFocusLost(evt);
            }
        });
        tblAddToPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAddToPurchaseMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddToPurchase);

        btnPurchaseIn.setText("采购入库");

        btnDelete.setText("删除");

        jLabel2.setText("请输入商品名称/供应商名称：");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 629, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 525, Short.MAX_VALUE)
                .addComponent(btnPurchaseIn)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuery)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuery)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchaseIn)
                    .addComponent(btnDelete))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed
        String key = this.txtSearch.getText().trim();
        list = purchaseService.queryPurchaseInInfo(key);
        refresh(list);
    }//GEN-LAST:event_btnQueryActionPerformed

    private void tblGoodsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGoodsMouseClicked
        int selectedRow = this.tblGoods.getSelectedRow();
        // 1.得到选中的记录的商品编号
        String productId = this.tblGoods.getValueAt(selectedRow, 0).toString();
        String productName = this.tblGoods.getValueAt(selectedRow, 1).toString();
        String supplierName = this.tblGoods.getValueAt(selectedRow, 3).toString();
        String suggestUnitPrice = this.tblGoods.getValueAt(selectedRow, 4).toString();
        DefaultTableModel dtm = (DefaultTableModel) this.tblAddToPurchase.getModel();
        Vector<String> v = new Vector<String>();
        if(null==productId){
            return;
        }
        // 2.获得下方table中的所有记录
        int rowCount = this.tblAddToPurchase.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            // 得到table中每一条记录的商品编号
            String pId = (String) this.tblAddToPurchase.getValueAt(i, 0);
            if (pId.equals(productId)) {
                return;
            }
        }
        v.add(productId);
        v.add(productName);
        v.add(supplierName);
        v.add(suggestUnitPrice);
        dtm.insertRow(0, v);

    }//GEN-LAST:event_tblGoodsMouseClicked

    private void tblAddToPurchaseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddToPurchaseMousePressed

    }//GEN-LAST:event_tblAddToPurchaseMousePressed

    private void tblAddToPurchaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblAddToPurchaseFocusLost
        int selectedIndex=this.tblAddToPurchase.getSelectedRow();
        int amount=(int)this.tblAddToPurchase.getValueAt(selectedIndex, 4);
        float price=(float)this.tblAddToPurchase.getValueAt(selectedIndex, 5);
        this.tblAddToPurchase.setValueAt(amount*price, selectedIndex, 6);
    }//GEN-LAST:event_tblAddToPurchaseFocusLost

    private void refresh(List<PurchaseInQueryDto> list) {
        //1获得表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblGoods.getModel();
        //2清空表格数据
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3显示新数据
        for (PurchaseInQueryDto s : list) {
            Vector v = new Vector();
            v.add(s.getProductId());
            v.add(s.getProductName());
            v.add(s.getSupplierId());
            v.add(s.getSupplierName());
            v.add(s.getProductSpp());
            dtm.addRow(v);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPurchaseIn;
    private javax.swing.JButton btnQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddToPurchase;
    private javax.swing.JTable tblGoods;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
