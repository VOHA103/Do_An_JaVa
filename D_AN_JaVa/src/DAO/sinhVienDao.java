/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.sinhVien;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thuha
 */
public class sinhVienDao {
    public static ArrayList<sinhVien> getDSSV(){
        ArrayList<sinhVien> ds =new ArrayList<>();
        
        String sql ="select*from SINHVIEN";
        try {
            ConnectionDB.getCon();
            ResultSet rs=ConnectionDB.executeQuery(sql);
            while(rs.next()){
                ds.add(new sinhVien(rs.getString("MASV").trim(), rs.getString("MALOP").trim(),rs.getString("MATT").trim(),rs.getString("HOTEN").trim(), rs.getDate("NGAYSINH"), rs.getString("GIOITINH").trim(),rs.getString("NOISINH").trim()));
            }
            System.out.println(ds);
        } catch (Exception e) {
        }
        return ds;
    }
    
    
    
     public static sinhVien layTTTheoMa(String ma)
     {
         for(sinhVien hv:getDSSV())
             if(hv.getMaSV().toLowerCase().equals(ma.trim().toLowerCase()))
                 return hv;
         return null;
     }
     
         public static String timTenSV(String maban) {
        String value = "";
        for (sinhVien b : getDSSV()) {
            if (b.getMaSV().trim().toLowerCase().equals(maban.trim().toLowerCase())) {
                value = b.getHoTen();
                break;
            }
        }
        return value;
    }
}
