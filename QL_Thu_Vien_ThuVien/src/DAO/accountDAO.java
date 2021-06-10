/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Account;
import POJO.Sach;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author thuha
 */
public class accountDAO {


    public static ArrayList<Account> getDSACount() {
        ArrayList<Account> ds = new ArrayList<>();
        String sql = "select*from ACCOUNT";
        try {
            ConnectionDB.getCon();
            ResultSet rs = ConnectionDB.executeQuery(sql);
            while (rs.next()) {
                ds.add(new Account(rs.getString("TENDANGNHAP").trim(), rs.getString("GMAIL").trim(), rs.getString("MATKHAU").trim(), rs.getString("NHAPLAIMK").trim()));
            }
            System.out.println(ds);
        } catch (Exception e) {
        }
        ConnectionDB.close();
        return ds;
    }

}
