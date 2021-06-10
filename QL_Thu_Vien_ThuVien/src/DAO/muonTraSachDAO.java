/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.MuonTRaSach;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author thuha
 */
public class muonTraSachDAO {

    public static ArrayList<MuonTRaSach> getDSMuonTRa() {
        ArrayList<MuonTRaSach> ds = new ArrayList<>();
        String sqlS = "select*from MUONTRA";
        try {
            ConnectionDB.getCon();
            ResultSet rs = ConnectionDB.executeQuery(sqlS);
            while (rs.next()) {
                ds.add(new MuonTRaSach(rs.getString("MAMT").trim(), rs.getString("MASV").trim(), rs.getString("MAS").trim(), rs.getString("HINHTHUCMUON").trim(), rs.getString("QUANLYTV"), rs.getInt("SOLUONGMUON"), rs.getDate("NGAYMUON"), rs.getDate("NGAYTRA")));

            }
            System.out.println(ds);
        } catch (Exception e) {
        }

        ConnectionDB.close();
        return ds;
    }

    public static int xoaMTra(String mmt) {
        int i = -1;
        String sql = "delete  MUONTRA where MAMT='" + mmt + "'";
        try {
            ConnectionDB.getCon();
            i = ConnectionDB.executeUpdate(sql);
        } catch (Exception e) {
        }
        ConnectionDB.close();

        return i;

    }

    public static int them(String MAMT, String MASV, String MAS, String HINHTHUCMUON, String QUANLYTV, int SOLUONGMUON, String NGAYMUON, String NGAYTRA) {
        int i = -1;

        String sql = " insert into MUONTRA values(?,?,?,?,?,?,?,?)";
        try {
            ConnectionDB.getCon();
            PreparedStatement pre = ConnectionDB.con.prepareStatement(sql);
            pre.setString(1, MAMT);
            pre.setString(2, MASV);
            pre.setString(3, MAS);
            pre.setString(4, HINHTHUCMUON);
            pre.setString(5, QUANLYTV);
            pre.setInt(6, SOLUONGMUON);
            pre.setString(7, NGAYMUON);
            pre.setString(8, NGAYTRA);
            i = pre.executeUpdate();
            pre.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trung ma muon tra ", "Thong bao", 1);

        }
        ConnectionDB.close();
        return i;

    }
}
