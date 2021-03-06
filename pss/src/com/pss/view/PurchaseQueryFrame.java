/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.view;

import com.pss.po.PurchaseQueryDto;
import com.pss.service.IPurchaseService;
import com.pss.service.impl.PurchaseServiceImpl;
import com.pss.util.ExportExcelUtil;
import com.pss.util.StringUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 * 采购查询页面
 *
 * @author 吴延昭
 */
public class PurchaseQueryFrame extends javax.swing.JInternalFrame {

    IPurchaseService purchaseService = new PurchaseServiceImpl();
    List<PurchaseQueryDto> list=null;

    /**
     * Creates new form PurchaseQueryFrame
     */
    public PurchaseQueryFrame() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.dpkStartDate.setFormats(sdf);
        this.dpkEndDate.setFormats(sdf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpkStartDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        dpkEndDate = new org.jdesktop.swingx.JXDatePicker();
        txtGoodsName = new javax.swing.JTextField();
        btnQuery = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchaseInfo = new javax.swing.JTable();
        btnPrintExcel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("采购查询");

        jLabel1.setText("-----");

        btnQuery.setText("查询");
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        tblPurchaseInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "采购单号", "采购商品名", "采购数量", "采购单价", "总价", "供应商", "采购时间", "采购员编号", "采购员名称"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPurchaseInfo);

        btnPrintExcel.setText("打印报表");
        btnPrintExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintExcelActionPerformed(evt);
            }
        });

        jLabel2.setText("请输入商品名：");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(dpkStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(dpkEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGoodsName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuery)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrintExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpkStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(dpkEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGoodsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuery)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnPrintExcel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed
        Date startTime = this.dpkStartDate.getDate();
        Date endTime = this.dpkEndDate.getDate();
        String productName = this.txtGoodsName.getText().trim();
        if(startTime==null||endTime.toString()==null){
            JOptionPane.showMessageDialog(this, "日期不能为空！");
            return;
        }
        list = purchaseService.queryByDateAndName(startTime, endTime, productName);
        refresh(list);
    }//GEN-LAST:event_btnQueryActionPerformed

    private void btnPrintExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintExcelActionPerformed
        // TODO add your handling code here:
        JFileChooser savefile = new JFileChooser();//文件选择对话框
        FileFilter filter = new FileNameExtensionFilter("Excel文件(*.xls)", "xls");
        savefile.addChoosableFileFilter(filter);//添加过滤器
        savefile.setFileFilter(filter);

        int flag = savefile.showSaveDialog(this);//打开文件选选择对话框

        File file = null;
        if (flag == JFileChooser.APPROVE_OPTION) {
            //如果点击了保存按钮
            file = savefile.getSelectedFile();//所选择的文件名（手写或选择），得到文件对象

            System.out.println("文件名：" + file.getAbsolutePath());
            String filename = file.getAbsolutePath(); // 路径 + 文件名
            //截取文件扩展名（文件名长度后4位）
            String ftype = filename.substring(filename.length() - 4);

            if (!ftype.equals(".xls")) {
                //如果用户没有填写扩展名，自动添加扩展名.xls
                file = new File(filename + ".xls");
            }
        //集合获取数据，输出到文件
            // psalelist 要导出的数据集合 例如：ArrayList<Student>
            
            ExportExcelUtil.printPurchaseQueryDto(list, file);
        }
    }//GEN-LAST:event_btnPrintExcelActionPerformed
    private void refresh(List<PurchaseQueryDto> list) {
        //1获得表格模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblPurchaseInfo.getModel();
        //2清空表格数据
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        //3显示新数据
        for (PurchaseQueryDto s : list) {
            Vector v = new Vector();
            v.add(s.getPurchaseId());
            v.add(s.getProductName());
            v.add(s.getPurchaseAmount());
            v.add(s.getPurchaseUnitPrice());
            v.add(s.getPurchaseTotalPrice());
            v.add(s.getSupplierName());
            v.add(s.getPurchaserDate());
            v.add(s.getOperatorId());
            v.add(s.getOperatorName());
            dtm.addRow(v);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintExcel;
    private javax.swing.JButton btnQuery;
    private org.jdesktop.swingx.JXDatePicker dpkEndDate;
    private org.jdesktop.swingx.JXDatePicker dpkStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPurchaseInfo;
    private javax.swing.JTextField txtGoodsName;
    // End of variables declaration//GEN-END:variables
}
