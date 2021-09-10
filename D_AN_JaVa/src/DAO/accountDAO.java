/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Account;
import POJO.Sach;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author thuha
 */
public class accountDAO {

    public static ArrayList<Account> getDSACount() {
        ArrayList<Account> ds = new ArrayList<>();
        try {
            ConnectionDB.getCon();
            String sql = "select*from ACCOUNT";

            ResultSet rs = ConnectionDB.executeQuery(sql);
            while (rs.next()) {
                ds.add(new Account(rs.getString("TENDANGNHAP").trim(), rs.getString("GMAIL").trim(), rs.getString("MATKHAU").trim()));
            }
            System.out.println(ds);
        } catch (Exception e) {
        }
        ConnectionDB.close();
        return ds;
    }

    public static int themNV(String tenDN, String gmail, String matKhau) {
        int i = -1;
        String sql = "insert into ACCOUNT values(?,?,?)";
        try {
            ConnectionDB.getCon();
            PreparedStatement pre = ConnectionDB.con.prepareStatement(sql);
            pre.setString(1, tenDN);
            pre.setString(2, gmail);
            pre.setString(3, matKhau);
       

            i = pre.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi", "Thông báo", 1);
        }
        ConnectionDB.close();
        return i;
    }

    public static boolean dangNhap(String tentk, String matKhau) {
        for (Account qt : getDSACount()) {
            if (qt.getTenDangNhap().equals(tentk) && qt.getMatKhau().equals(matKhau)) {
                return true;
            }
        }
        return false;
    }

    public static Account layTTTheoUser(String ma) {
        for (Account hv : getDSACount()) {
            if (hv.getTenDangNhap().toLowerCase().equals(ma.trim().toLowerCase())) {
                return hv;
            }
        }
        return null;
    }
}
