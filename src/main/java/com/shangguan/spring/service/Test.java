package com.shangguan.spring.service;

import  com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import net.ucanaccess.jdbc.UcanaccessDriver;

import java.sql.*;
import java.util.Enumeration;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String s = "jdbc:ucanaccess://e://zuoye//house.accdb";

        DruidDataSource ds = new  DruidDataSource();
        ds.setUrl(s);
        ds.setDriverClassName("net.ucanaccess.jdbc.UcanaccessDriver");
        DruidPooledConnection tt = ds.getConnection();

        System.out.println(tt);

        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

        String databaseURL = s;
        Connection con = DriverManager.getConnection(databaseURL);

        System.out.println(con);


        String sql ="select * from house";
          sql =" select b.pno, b.pname , b.ptel, c.cname ,c.cno from  passinfo a , person b , house c \n" +
                  "    where a.pno = b.pid and a.cno = c.cid" +
                  "";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String id = rs.getString("cname");
        String [] a = {

                "pno"
                , "cname"
                , "ptel"
                , "cname"
                , "cname"
                , "cno"
        };
        for (String k : a) {
            System.out.println( rs.getString(k) );
        }
        rs.close();
        st.close();

        con.close();
    }

    private static void hhx() throws ClassNotFoundException, SQLException {
        Class.forName("com.hxtt.sql.access.AccessDriver");

        Connection con = DriverManager.getConnection("jdbc:Access:///e/zuoye:/house.accdb");

        String sql ="select * from house";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String id = rs.getString("cname");
        System.out.println(id);
        rs.close();
        st.close();
        ;
        con.close();
    }

    private static void aaaaaaaaaaaaa() {
        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        try{
            Class.forName(driver);
            String url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=e:\\zuoye\\house.accdb";
            //String url ="jdbc:odbc:acc";
            Connection con = DriverManager.getConnection(url);
            if(!con.isClosed()){
                System.out.print("连接成功！");
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private static void abc() throws SQLException {
        // Class.forName("net.ucanaccess.jdbc.UcanaccessDrive");
        String filepath ="e:/zuoye/house.accdb";
//        String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + filepath;
//
//        java.sql.Connection conn = java.sql.DriverManager.getConnection(
//                "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};" +
//                        "DBQ=e:\\zuoye\\house.accdb;DriverID=22;READONLY=true", "", ""
//        );

        String databaseURL = "jdbc:ucanaccess://e://zuoye//house.accdb";
        Connection connection = DriverManager.getConnection(databaseURL);
        Enumeration<Driver> ss = DriverManager.getDrivers();
        while (ss.hasMoreElements()) {
            System.out.println(ss.nextElement());
        }
        System.out.println(ss);
        System.out.println(connection);


        String sql ="select * from house";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String id = rs.getString("cid");
        System.out.println(id);
        rs.close();
        st.close();
        ;
        connection.close();
        ;
    }
}
