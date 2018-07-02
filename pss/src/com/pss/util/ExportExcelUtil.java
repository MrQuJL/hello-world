/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pss.util;

import com.pss.po.Example;
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
 * @author 曲健磊
 */
public class ExportExcelUtil {
    
    /**
     * 导出员工信息
     * @param empList
     * @param file 
     */
    public static void printEmployee(List<Example> eList,File file){
        // 1.设定表头列名
        String eid = "员工编号";
        String ename = "员工名称";
        String jointime = "入职时间";
        String did = "部门编号";
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
            //WritableSheet sheet2 = book.createSheet("第二页", 1); //创建第二页
           //创建字体，7个参数分别是字体名称，字号，是否粗体，是否斜体，下划线，颜色，上下标
            WritableFont font = new WritableFont(WritableFont.TIMES, 13, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.DARK_RED, ScriptStyle.NORMAL_SCRIPT); 
            WritableFont font1 = new WritableFont(WritableFont.TIMES, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK, ScriptStyle.NORMAL_SCRIPT);
            
            WritableCellFormat format = new WritableCellFormat(font); //将字体放入单元格式中

            WritableCellFormat format1 = new WritableCellFormat(font1);
           
            format1.setAlignment(Alignment.CENTRE); //对齐方式的设定

            format.setAlignment(Alignment.CENTRE); //对齐方式的设定
            // 3.设置第一行为列名,并添加列名
            Label labelPname= new Label(0, 0, eid, format); //写入字符串，确定位置（列，行）、内容和格式
            Label labelFirstmonth = new Label(1, 0, ename, format);
            Label labelSecondmonth = new Label(2, 0,jointime, format);
            Label labelThirdmonth= new Label(3, 0, did, format);
            //添加列名
            sheet1.addCell(labelPname); //sheet对象添加文本的数据类型为Label
            sheet1.addCell(labelFirstmonth);
            sheet1.addCell(labelSecondmonth);
            sheet1.addCell(labelThirdmonth);
            //4.取出List集合中的的内容，放到Excel中
            int row = eList.size();//获取集合的长度作为表格的行数
            for (int i = 0; i < row; i++) {
                //获取每一行数据，从第一行开始，第0行是标题
                /*Label pname1 = new Label(0, i+1, empList.get(i).getEid()+"", format1);
                Label firstmonth1 = new Label(1, i+1, empList.get(i).getEname().toString(), format1);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String s = sdf.format(empList.get(i).getJointime());
                Label secondmonth1 = new Label(2, i+1, s, format1);
                Label thirdmonth1 = new Label(3, i+1, empList.get(i).getDid() + "", format1);*/
                //添加每一行内容
                /*sheet1.addCell(pname1);
                sheet1.addCell(firstmonth1);
                sheet1.addCell(secondmonth1);
                sheet1.addCell(thirdmonth1);*/
            }
            // 5.保存数据，存盘
            book.write();
            book.close();
        } catch (WriteException | IOException ex) {
        }
    }
}
