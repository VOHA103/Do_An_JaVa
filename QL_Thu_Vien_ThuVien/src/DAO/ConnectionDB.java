/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author thuha
 */
public class ConnectionDB {
    static Connection con;

    public static Connection getCon() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Do_An_QL_ThuVien";
            String user = "sa";
            String pass = "10032001";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Ket noi csdl thanh cong");

        } catch (Exception e) {
            System.out.println("Ket noi csdl not  thanh cong");

        }

        return con;
    }

   

    public static void close() {
        try {
            con.close();
        } catch (Exception e) {
        }
    }

    public static ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement stm = con.createStatement();
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
        }

        return rs;

    }

    public static int executeUpdate(String sql) {
        int i = -1;

        try {
            Statement stm = con.createStatement();
            i = stm.executeUpdate(sql);
        } catch (Exception e) {
        }
        return i;

    }

}
