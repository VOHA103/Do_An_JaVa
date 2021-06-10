/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thuha
 */
public class sachDAO {

    public static ArrayList<Sach> getDSSach() {
        ArrayList<Sach> ds = new ArrayList<>();
        String sqlString = "select*from SACH";
        try {
            ConnectionDB.getCon();
            ResultSet rs = ConnectionDB.executeQuery(sqlString);
            while (rs.next()) {

                ds.add(new Sach(rs.getString("MAS").trim(), rs.getString("TENS").trim(), rs.getString("TACGIA").trim(),
                        rs.getString("LOAI").trim(), rs.getString("TINHTRANG").trim(), rs.getInt("NAMXB"), rs.getInt("SOTRANG"), rs.getInt("GIA")));
            }

            System.out.println(ds);
        } catch (Exception e) {
        }
        return ds;
    }

    public static int themSach(String MAS, String TENS, String TACGIA, int NAMXB, String LOAI, int SOTRANG, int GIA, String TINHTRANG) {
        int i = -1;
        String sql = "insert into SACH values(?,?,?,?,?,?,?,?)";
        try {
            ConnectionDB.getCon();
            PreparedStatement pre = ConnectionDB.con.prepareStatement(sql);
            pre.setString(1, MAS);
            pre.setString(2, TENS);
            pre.setString(3, TACGIA);
            pre.setInt(4, NAMXB);
            pre.setString(5, LOAI);
            pre.setInt(6, SOTRANG);
            pre.setInt(7, GIA);
            pre.setString(8, TINHTRANG);
            i = pre.executeUpdate();
            pre.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trung ma hoac ten sach", "Thong bao", 1);
        }
        ConnectionDB.close();
        return i;
    }

    public static int xoaSach(String ms) {
        int i = -1;
        String sql = "delete SACH where MAS='" + ms + "'";
        try {
            ConnectionDB.getCon();
            i = ConnectionDB.executeUpdate(sql);
        } catch (Exception e) {
        }
        ConnectionDB.close();
        return i;
    }

    public static int updateSach(String MAS, String TENS, String TACGIA, int NAMXB, String LOAI, int SOTRANG, int GIA, String TINHTRANG) {

        int i = -1;
        String sql = "update SACH set   TENS=?, TACGIA=?, NAMXB=?,  LOAI=?,  SOTRANG=?, GIA=?,  TINHTRANG=?  where MAS=?";
        try {
            ConnectionDB.getCon();
            PreparedStatement pre = ConnectionDB.con.prepareStatement(sql);
            pre.setString(8, MAS);
            pre.setString(1, TENS);
            pre.setString(2, TACGIA);
            pre.setInt(3, NAMXB);
            pre.setString(4, LOAI);
            pre.setInt(5, SOTRANG);
            pre.setInt(6, GIA);
            pre.setString(7, TINHTRANG);
            i = pre.executeUpdate();
            pre.close();
        } catch (Exception e) {

        }
        ConnectionDB.close();
        return i;
    }

    public static int timSach() {
        int i = -1;

        return i;
    }

}
