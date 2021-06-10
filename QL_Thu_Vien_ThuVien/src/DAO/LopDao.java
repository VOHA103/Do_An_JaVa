/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.Lop;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thuha
 */
public class LopDao {
    public static ArrayList<Lop> getDSLop(){
        ArrayList<Lop> ds =new ArrayList<>();
        String sql ="select *from LOP";
        try {
            ConnectionDB.getCon();
            ResultSet s =ConnectionDB.executeQuery(sql);
            while(s.next()){
                ds.add(new Lop(s.getString("MALOP").trim(),s.getString("TENLOP").trim()));
            }
            System.out.println(ds);
        } catch (Exception e) {
        }
        
        return ds;
    }
}
