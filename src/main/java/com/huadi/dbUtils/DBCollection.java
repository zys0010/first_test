package com.huadi.dbUtils;

import org.junit.Test;
import org.junit.runners.JUnit4;

import java.sql.*;

/**
 * @author jacky
 * @date 2020年 08月25日 16:35:20
 */
public class DBCollection {
    private static String URL = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";
    private static Connection con = null;
    private static PreparedStatement ps = null;
            ResultSet rs= null;

    /**
     * 获取连接
     * @return
     * @throws ClassNotFoundException
     */
/*    public static Connection getConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
             con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }*/

    /**
     * 清理资源
     * @param con
     * @param ps
     * @param rs
     */
    public static void closeResource(Connection con , PreparedStatement ps , ResultSet rs){

        try{
            if(con != null){
                con.close();
            }
            if(ps != null){
                ps.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }


    }

    @Test
    public  void insertUser() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        try {
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        con.setAutoCommit(false); //事务提交方式 (true:自动提交  false:手动提交)

        try {
            ps = con.prepareStatement("insert into t_account values (?,?)");
            ps.setString(1,"tom123");
            ps.setString(2,"111");
            ps.executeUpdate();

            con.commit();  //事务提交数据库
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeResource(con,ps,rs);
    }
//    public static void selectUser() throws ClassNotFoundException, SQLException {
//        Connection connectionon = getConnection();
//        PreparedStatement ps = connectionon.prepareStatement("select * from t_account");
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()){
//            System.out.println(rs.getString("username")+"/"+rs.getString("password"));
//        }
//        closeResource(connectionon,ps,rs);
//    }
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
////        Connection con = DBCollection.getConnection();
////        System.out.println(con);
//        selectUser();
//
//    }
}
