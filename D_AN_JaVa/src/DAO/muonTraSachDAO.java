/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.sachDAO.getDSSach;
import POJO.MuonTRaSach;
import POJO.Sach;
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

    public static int them(String MAMT, String MASV, String MAS, int SOLUONGMUON, String HINHTHUCMUON, String QUANLYTV, String NGAYMUON, String NGAYTRA) {
        int i = -1;
        try {
            String sql = "set dateFormat DMY;insert into MUONTRA values(?,?,?,?,?,?,?,?)";

            PreparedStatement pre = ConnectionDB.getCon().prepareStatement(sql);
            pre.setString(1, MAMT);
            pre.setString(2, MASV);
            pre.setString(3, MAS);
            pre.setInt(4, SOLUONGMUON);

            pre.setString(5, HINHTHUCMUON);
            pre.setString(6, QUANLYTV);

            pre.setString(7, NGAYMUON);
            pre.setString(8, NGAYTRA);
            i = pre.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi ", "Thông báo", 1);

        }
        ConnectionDB.close();
        return i;
    }

    public static ArrayList<MuonTRaSach> timB(String MaSP) {
        ArrayList<MuonTRaSach> ds = new ArrayList<>();
        try {
            String sql = "select*from MUONTRA where MAMT  like'" + MaSP + "'";
            ConnectionDB.getCon();
            ResultSet rs = ConnectionDB.executeQuery(sql);
            while (rs.next()) {
                ds.add(new MuonTRaSach(rs.getString("MAMT").trim(), rs.getString("MASV").trim(), rs.getString("MAS").trim(), rs.getString("HINHTHUCMUON").trim(), rs.getString("QUANLYTV"), rs.getInt("SOLUONGMUON"), rs.getDate("NGAYMUON"), rs.getDate("NGAYTRA")));
            }
            ConnectionDB.close();
        } catch (Exception e) {
        }
        return ds;

    }

    public static int timSLMuon(String sl) {
        int value = 0;
        for (MuonTRaSach b : getDSMuonTRa()) {
            if (b.getMaMuonTRa().trim().toLowerCase().equals(sl.trim().toLowerCase())) {
                value = b.getSoLuongMuon();
                break;
            }
        }
        return value;
    }

    public static String timHThucMuon(String HT) {
        String value = "";
        for (MuonTRaSach b : getDSMuonTRa()) {
            if (b.getMaMuonTRa().trim().toLowerCase().equals(HT.trim().toLowerCase())) {
                value = b.getHinhThucMuon();
                break;
            }
        }
        return value;
    }

    public static String timQLThuVen(String QL) {
        String value = "";
        for (MuonTRaSach b : getDSMuonTRa()) {
            if (b.getMaMuonTRa().trim().toLowerCase().equals(QL.trim().toLowerCase())) {
                value = b.getQuanLyThuVien();
                break;
            }
        }
        return value;

    }

   
}
