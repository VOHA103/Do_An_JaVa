/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author thuha
 */
public class hoTRo {
     static SimpleDateFormat ft= new SimpleDateFormat("dd/MM/yyyy");
    
    
    public static boolean checkRong(JTextField txt){
        if(txt.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Khong duoc de trong thong tin","Thong bao", 1);
        txt.requestFocus();
        return true;
        }
        return false;
    }
}
