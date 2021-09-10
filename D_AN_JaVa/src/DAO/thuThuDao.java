/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.thuThu;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thuha
 */
public class thuThuDao {
    public static ArrayList<thuThu> getDSTT(){
       ArrayList<thuThu> ds =new ArrayList<>();
       String sql ="select*from THUTHU";
        try {
            ConnectionDB.getCon();
            ResultSet rs =ConnectionDB.executeQuery(sql);
            while(rs.next()){
                ds.add(new thuThu(rs.getString("MATT").trim(),rs.getString("TENTT").trim(),rs.getString("GIOITINHTT").trim(), rs.getDate("NGAYSINHTT"), rs.getString("DIACHITT").trim(),rs.getString("DIENTHOAITT").trim(),rs.getString("EMAIL").trim()));
            }
            System.out.println(ds);
        } catch (Exception e) {
        }
       
       return ds;
    }
}
