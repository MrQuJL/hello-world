/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pss.util;

import com.pss.po.SaleQueryMore;

import java.io.File;
import java.io.IOException;
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
 *
 * @author zxc
 */
public class SalesQueryExcelUtil {
      public static void printSale(List<SaleQueryMore> psalelist,File file){
        
            try {
            //2==============创建excel文件并设置数据显示格式
            WritableWorkbook book = Workbook.createWorkbook(file); //创建特殊类型的变量使之与Excel表格对应以便于操作            
            WritableSheet sheet1 = book.createSheet("第一页", 0); //在表格中创建第一页，参数指明页的名称和索引，索引从0开始
            
            sheet1.setColumnView(0, 20); //设置某一列的宽度 【  第0列的列宽 】
            //sheet1.setRowView(0, 400); //设置某一行的高度
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
            //3 ============设置第一行为列名,并添加列名   【表头的部分】
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, 
                    WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT);  //字体一
            WritableCellFormat format = new WritableCellFormat(font); 
            format.setAlignment(Alignment.CENTRE); //对齐方式的设定   
           
            
            Label labelDelivery_ID= new Label(0, 0, "销售单号", format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelName = new Label(1, 0, "销售商品名", format);
            Label labelSell_amount = new Label(2, 0,"销售数量", format);
            Label labelSell_prive= new Label(3, 0, "销售价格", format);
            Label labelsalemoney=new Label(4, 0, "销售金额", format);
            Label labelCustomer_name=new Label(5, 0, "客户姓名",format);
          
            
            //添加列名
            sheet1.addCell(labelDelivery_ID);
            sheet1.addCell(labelName);
            sheet1.addCell(labelSell_amount);
            sheet1.addCell(labelSell_prive);
            sheet1.addCell(labelsalemoney);
            sheet1.addCell(labelCustomer_name);
             //sheet对象添加文本的数据类型为Label
         
            
            //4 =====================取出List集合中的的内容，放到Excel中
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, 
            UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT); //字体二
            WritableCellFormat format1 = new WritableCellFormat(font1);
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定
            
            int row = psalelist.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                Label  delivery_id=new Label(0, i+1,psalelist.get(i).getDeliver_id(),format1);
                Label name = new Label(1, i+1, psalelist.get(i).getName().toString(), format1);
                String mountInteger=String.valueOf(psalelist.get(i).getSell_amount());
                Label sell_amount=new Label(2, i+1, mountInteger, format1);
                String priceInteger=String.valueOf(psalelist.get(i).getSell_unit_price());
                Label sell_price=new Label(3, i+1, priceInteger, format1);
                 String moneyInteger=String.valueOf(psalelist.get(i).getSalemoney());
                Label sellmoney=new Label(4, i+1,moneyInteger, format1);
                Label customer_name=new Label(5, i+1, psalelist.get(i).getCustomer_name().toString(), format);
                
               
                //每一行内容
                sheet1.addCell(delivery_id);
                sheet1.addCell(name);
                sheet1.addCell(sell_amount);
                sheet1.addCell(sell_price);
                sheet1.addCell(sellmoney);
                sheet1.addCell(customer_name);
            }
            //5 ===================保存数据，存盘
            book.write();//存盘
            book.close();
        } catch (WriteException ex) {
          ex.printStackTrace();

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
