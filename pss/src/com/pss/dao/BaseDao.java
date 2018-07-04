package com.pss.dao;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 * 封装了获取数据库的连接，查找单个对象，多个对象
 * 模糊查询多个对象，增删改等操作
 * @author 曲健磊
 */
public class BaseDao {
    
    /**
     * 获取数据库连接
     * @return 
     */
    public Connection getConnection() {
        Connection conn = null;
        String jdbcURL = "jdbc:mysql://localhost:3306/pss??useUnicode=true&characterEncoding=UTF-8";
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "123";
        try {
            DbUtils.loadDriver(jdbcDriver); // 加载mysql的数据库驱动
            conn = DriverManager.getConnection(jdbcURL, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 查找多个对象
     * 
     * @param <T>
     * @param sqlString
     * @param clazz
     * @return
     */
    public <T> List<T> query(String sqlString, Class clazz) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            //select * from department  name id empno..
            beans = (List) qRunner.query(conn, sqlString, new BeanListHandler(
                            clazz));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }
    
    /**
     * 查找多个对象(模糊查询)
     * 
     * @param <T>
     * @param sqlString
     * @param clazz
     * @return
     */
    public <T> List<T> query(String sqlString, Class clazz, Object...params) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            //select * from department  name id empno..
            beans = (List) qRunner.query(conn, sqlString, new BeanListHandler(
                            clazz), params);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }

    /**
     * 查找单个对象
     * 
     * @param sqlString
     * @param clazz
     * @return
     */
    public Object get(String sqlString, Class clazz) {
        List beans = null;
        Object obj = null;
        Connection conn = null;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            beans = (List) qRunner.query(conn, sqlString, new BeanListHandler(
                            clazz));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        if (beans != null && !beans.isEmpty()) { // 注意这里
            obj = beans.get(0);
        }
        return obj;
    }

    /**
     * 执行更新的sql语句,插入,修改,删除
     * 
     * @param sqlString
     * @return
     */
    public boolean update(String sqlString, Object[] params) {
        Connection conn = null;
        boolean flag = false;
        try {
            conn = getConnection();
            QueryRunner qRunner = new QueryRunner();
            int i = qRunner.update(conn, sqlString, params);
            if (i > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return flag;
    }
    
    /**
     * 增加记录返回主键
     * @param sqlString
     * @param params
     * @return 
     */
    public int updateMasterGetId(String sqlString, Object... params) {
        Connection conn = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int  id = -1;
        try {
            conn = getConnection();
            ps=conn.prepareStatement(sqlString, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, (String) params[0]);
            ps.setString(2, (String) params[1]);
            ps.executeUpdate();
            rs=ps.getGeneratedKeys();
            if(rs.next()){
                id=rs.getInt(1);
            }
        } catch (SQLException e) {
        } finally {
            DbUtils.closeQuietly(conn,ps,rs);
        }
        return id;
    }
    
}