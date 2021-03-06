/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.util;

import com.pss.dto.InventoryDTO;
import com.pss.dto.PurchaseCountDTO;
import com.pss.po.PurchaseQueryDto;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.format.ScriptStyle;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * Excel导出工具类
 * @author 吴延昭
 * @author 曲健磊
 */
public class ExportExcelUtil {
    
    /**
     * 导出采购统计信息
     * @param pcList 采购统计列表
     * @param file 要写入的文件
     */
    public static void printPurchaseCount(List<PurchaseCountDTO> pcList,File file){
        // 1.设定表头列名
        String productId = "商品编号";
        String productName = "商品名称";
        String purchaseAmount = "采购数量";
        String purchaseMoney = "采购金额";
        try {
            // 2.创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("采购统计", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置第一行第二列的高度和宽度
            sheet1.setColumnView(1, 20);
            //sheet1.setRowView(1, 500);
            //设置第一行第三列的高度和宽度
            sheet1.setColumnView(2, 20);
            //sheet1.setRowView(2, 500);
            sheet1.setColumnView(3, 20);
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            // 3.设置第一行为列名,并添加列名
            Label labelPname= new Label(0, 0, productId, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelFirstmonth = new Label(1, 0, productName, format);
            Label labelSecondmonth = new Label(2, 0,purchaseAmount, format);
            Label labelThirdmonth= new Label(3, 0, purchaseMoney, format);
            //添加列名
            sheet1.addCell(labelPname); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelFirstmonth);
            sheet1.addCell(labelSecondmonth);
            sheet1.addCell(labelThirdmonth);
            //4.取出List集合中的的内容，放到Excel中
            int row = pcList.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label pId = new Label(0, i+1, pcList.get(i).getProductId()+"", format1);
                Label pName = new Label(1, i+1, pcList.get(i).getProductName(), format1);
                Label pAmount = new Label(2, i+1, pcList.get(i).getPurchaseAmount().toString(), format1);
                Label pMoney = new Label(3, i+1, pcList.get(i).getPurchaseMoney().toString() + "", format1);
                //添加每一行内容
                sheet1.addCell(pId);
                sheet1.addCell(pName);
                sheet1.addCell(pAmount);
                sheet1.addCell(pMoney);
            }
            // 5.保存数据，存盘
            book.write();
            book.close();
        } catch (WriteException | IOException ex) {
        }
    }
    
    /**
     * 导出库存统计信息
     * @param inventoryList 库存列表
     * @param file 要写入的文件
     */
    public static void printInventory(List<InventoryDTO> inventoryList,File file){
        // 1.设定表头列名
        String productId = "商品编号";
        String productName = "商品名称";
        String inventory = "当前库存";
        String safeStock = "安全库存";
        String suggPurchasePrice = "建议采购价";
        String purchaseDate = "最近采购日期";
        String suggSellPrice = "建议销售价";
        String sellDate = "最近销售日期";
        String supplierId = "供应商编号";
        String supplierName = "供应商名称";
        try {
            // 2.创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("库存统计", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置第一行第二列的高度和宽度
            sheet1.setColumnView(1, 20);
            //sheet1.setRowView(1, 500);
            //设置第一行第三列的高度和宽度
            sheet1.setColumnView(2, 20);
            //sheet1.setRowView(2, 500);
            sheet1.setColumnView(3, 20);
            sheet1.setColumnView(4, 20);
            sheet1.setColumnView(5, 20);
            sheet1.setColumnView(6, 20);
            sheet1.setColumnView(7, 20);
            sheet1.setColumnView(8, 20);
            sheet1.setColumnView(9, 20);
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            // 3.设置第一行为列名,并添加列名
            Label labelProductId = new Label(0, 0, productId, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelProductName = new Label(1, 0, productName, format);
            Label labelInventory = new Label(2, 0,inventory, format);
            Label labelSafeStock = new Label(3, 0, safeStock, format);
            Label labelSuggPurchasePrice = new Label(4, 0, suggPurchasePrice, format);
            Label labelPurchaseDate = new Label(5, 0, purchaseDate, format);
            Label labelSuggSellPrice = new Label(6, 0, suggSellPrice, format);
            Label labelSellDate = new Label(7, 0, sellDate, format);
            Label labelSupplierId = new Label(8, 0, supplierId, format);
            Label labelSupplierName = new Label(9, 0, supplierName, format);
            //添加列名
            sheet1.addCell(labelProductId); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelProductName);
            sheet1.addCell(labelInventory);
            sheet1.addCell(labelSafeStock);
            sheet1.addCell(labelSuggPurchasePrice);
            sheet1.addCell(labelPurchaseDate);
            sheet1.addCell(labelSuggSellPrice);
            sheet1.addCell(labelSellDate);
            sheet1.addCell(labelSupplierId);
            sheet1.addCell(labelSupplierName);
            //4.取出List集合中的的内容，放到Excel中
            int row = inventoryList.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label pId = new Label(0, i+1, inventoryList.get(i).getProductId()+"", format1);
                Label pName = new Label(1, i+1, inventoryList.get(i).getProductName(), format1);
                Label pInventory = new Label(2, i+1, inventoryList.get(i).getPurchaseAmount().toString(), format1);
                Label pSafeStock = new Label(3, i+1, inventoryList.get(i).getSafeStock().toString() + "", format1);
                Label pSugPurPrice = new Label(4, i+1, inventoryList.get(i).getSpprice().toString() + "", format1);
                Label pPurDate = new Label(5, i+1, inventoryList.get(i).getSpdate().toString() + "", format1);
                Label pSugSellPrice = new Label(6, i+1, inventoryList.get(i).getsSellPrice().toString() + "", format1);
                Label pSellDate = new Label(7, i+1, inventoryList.get(i).getDeliverDate().toString() + "", format1); // 日期
                Label pSupId = new Label(8, i+1, inventoryList.get(i).getSupplierId().toString() + "", format1);
                Label pSupName = new Label(9, i+1, inventoryList.get(i).getSupplierName().toString() + "", format1);
                
                //添加每一行内容
                sheet1.addCell(pId);
                sheet1.addCell(pName);
                sheet1.addCell(pInventory);
                sheet1.addCell(pSafeStock);
                sheet1.addCell(pSugPurPrice);
                sheet1.addCell(pPurDate);
                sheet1.addCell(pSugSellPrice);
                sheet1.addCell(pSellDate);
                sheet1.addCell(pSupId);
                sheet1.addCell(pSupName);
            }
            // 5.保存数据，存盘
            book.write();
            book.close();
        } catch (WriteException | IOException ex) {
        }
    }
    
    /**
     * 导出员工信息
     * @param eList
     * @param file
     */
    public static void printPurchaseQueryDto(List<PurchaseQueryDto> eList, File file) {
        // 1.设定表头列名
        String purchaseId = "采购单号";
        String productName = "采购商品名";
        String purchaseAmount = "采购数量";
        String purchaseUnitPrice = "采购单价";
        String purchaseTotalPrice = "总价";
        String supplierName = "供应商";
        String purchaserDate = "采购时间";
        String operatorId = "采购员编号";
        String operatorName = "采购员名称";

        try {
            // 2.创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作
            WritableSheet sheet1 = book.createSheet("工作表名称", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            sheet1.setColumnView(0, 20); //设置某一列的宽度
            sheet1.setRowView(0, 400); //设置某一行的高度
            //设置第一行第二列的高度和宽度
            sheet1.setColumnView(1, 20);
            //sheet1.setRowView(1, 500);
            //设置第一行第三列的高度和宽度
            sheet1.setColumnView(2, 20);
            //sheet1.setRowView(2, 500);
            sheet1.setColumnView(3, 20);
            sheet1.setColumnView(4, 20);
            sheet1.setColumnView(5, 20);
            sheet1.setColumnView(6, 20);
            sheet1.setColumnView(7, 20);
            sheet1.setColumnView(8, 20);
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
            //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT);
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);

            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);

            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            // 3.设置第一行为列名,并添加列名
            Label labelPurchaseId = new Label(0, 0, purchaseId, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelProductName = new Label(1, 0, productName, format);
            Label labelPurchaseAmount = new Label(2, 0, purchaseAmount, format);
            Label labelPurchaseUnitPrice = new Label(3, 0, purchaseUnitPrice, format);
            Label labelPurchaseTotalPrice = new Label(4, 0, purchaseTotalPrice, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelSupplierName = new Label(5, 0, supplierName, format);
            Label labelPurchaserDate = new Label(6, 0, purchaserDate, format);
            Label labelOperatorId = new Label(7, 0, operatorId, format);
            Label labelOperatorName = new Label(8, 0, operatorName, format);
            //添加列名
            sheet1.addCell(labelPurchaseId); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelProductName);
            sheet1.addCell(labelPurchaseAmount);
            sheet1.addCell(labelPurchaseUnitPrice);
            sheet1.addCell(labelPurchaseTotalPrice);
            sheet1.addCell(labelSupplierName);
            sheet1.addCell(labelPurchaserDate);
            sheet1.addCell(labelOperatorId);
            sheet1.addCell(labelOperatorName);
            //4.取出List集合中的的内容，放到Excel中
            int row = eList.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label labelPurchaseId1 = new Label(0, i + 1, eList.get(i).getPurchaseId() + "", format1);
                Label labelProductName1 = new Label(1, i + 1, eList.get(i).getProductName() + "", format1);
                Label labelPurchaseAmount1 = new Label(2, i + 1, eList.get(i).getPurchaseAmount() + "", format1);
                Label labelPurchaseUnitPrice1 = new Label(3, i + 1, eList.get(i).getPurchaseUnitPrice() + "", format1);
                Label labelPurchaseTotalPrice1 = new Label(4, i + 1, eList.get(i).getPurchaseTotalPrice() + "", format1);
                Label labelSupplierName1 = new Label(5, i + 1, eList.get(i).getSupplierName() + "", format1);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(eList.get(i).getPurchaserDate());
                Label labelPurchaserDate1 = new Label(6, i + 1, date, format1);
                Label labelOperatorId1 = new Label(7, i + 1, eList.get(i).getOperatorId() + "", format1);
                Label labelOperatorName1 = new Label(8, i + 1, eList.get(i).getOperatorName() + "", format1);
                //添加每一行内容
                sheet1.addCell(labelPurchaseId1);
                sheet1.addCell(labelProductName1);
                sheet1.addCell(labelPurchaseAmount1);
                sheet1.addCell(labelPurchaseUnitPrice1);
                sheet1.addCell(labelPurchaseTotalPrice1);
                sheet1.addCell(labelSupplierName1);
                sheet1.addCell(labelPurchaserDate1);
                sheet1.addCell(labelOperatorId1);
                sheet1.addCell(labelOperatorName1);
            }
            // 5.保存数据，存盘
            book.write();
            book.close();
        } catch (WriteException | IOException ex) {
        }
    }
    
}
