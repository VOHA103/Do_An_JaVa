/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author thuha
 */
public class ThemTKDangNhap extends javax.swing.JFrame {

    public ThemTKDangNhap() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=Do_An_QL_ThuVien";
    String user = "sa";
    String pass = "10032001";
    Statement st;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_dangnhap = new javax.swing.JButton();
        btn_dangky = new javax.swing.JButton();
        txt_tennguoidung = new javax.swing.JTextField();
        txt_gamil = new javax.swing.JTextField();
        txt_matkhau = new javax.swing.JPasswordField();
        txt_nhaplaipass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THÊM TÀI KHOẢN ĐN");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Mật khẩu");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Nhập lại mật khẩu");

        btn_dangnhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_dangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Log-Off-icon (1).png"))); // NOI18N
        btn_dangnhap.setText("Đăng nhập");
        btn_dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangnhapActionPerformed(evt);
            }
        });

        btn_dangky.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_dangky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pen-icon (2).png"))); // NOI18N
        btn_dangky.setText("Đăng ký");
        btn_dangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangkyActionPerformed(evt);
            }
        });

        txt_tennguoidung.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_gamil.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_matkhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_nhaplaipass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_nhaplaipass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nhaplaipassFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Users-icon.png"))); // NOI18N
        jLabel1.setText("THÊM TÀI KHOẢN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Tên người dùng");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Gmail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(btn_dangnhap)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_dangky))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tennguoidung)
                                .addComponent(txt_gamil)
                                .addComponent(txt_matkhau)
                                .addComponent(txt_nhaplaipass, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 65, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_gamil, txt_matkhau, txt_nhaplaipass, txt_tennguoidung});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_dangky, btn_dangnhap});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_tennguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_gamil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nhaplaipass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dangky)
                    .addComponent(btn_dangnhap))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_gamil, txt_matkhau, txt_nhaplaipass, txt_tennguoidung});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_dangky, btn_dangnhap});

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void checkPass() {
        String mk = txt_matkhau.getText();
        String nhapLaiMK = txt_nhaplaipass.getText();
        if (!mk.equals(nhapLaiMK)) {
            JOptionPane.showMessageDialog(this, "Mat khau khong khop,vui long nhap lai.");
        }
    }

    public void reset() {
        txt_tennguoidung.setText("");
        txt_gamil.setText("");
        txt_matkhau.setText("");
        txt_nhaplaipass.setText("");
        txt_tennguoidung.requestFocus();

    }
    private void btn_dangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangkyActionPerformed


        try {
            Class.forName(driver);
            
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "insert into ACCOUNT values(?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, txt_tennguoidung.getText());
            ps.setString(2, txt_gamil.getText());
            ps.setString(3, txt_matkhau.getText());
            ps.setString(4, txt_nhaplaipass.getText());
            
            if (txt_tennguoidung.getText().equals("") || txt_gamil.getText().equals("") || txt_matkhau.getText().equals("") || txt_nhaplaipass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống dữ liệu!!.");
                return ;
            }
            
            int n = ps.executeUpdate();
            
            if (n != 0) {
                JOptionPane.showMessageDialog(this, "Đăng ký thành công.");


            } else {
//                JOptionPane.showMessageDialog(this, "Đăng ký thất bại.");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trung ten nguoi su dung.Vui long nhap lai ", "Thong bao", 1);
            txt_tennguoidung.setText("");
            txt_tennguoidung.requestFocus();

        }

        
    }//GEN-LAST:event_btn_dangkyActionPerformed

    private void txt_nhaplaipassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nhaplaipassFocusLost
        checkPass();
    }//GEN-LAST:event_txt_nhaplaipassFocusLost

    private void btn_dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangnhapActionPerformed
        setVisible(false);

        new Login().setVisible(true);
    }//GEN-LAST:event_btn_dangnhapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemTKDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTKDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTKDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTKDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemTKDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dangky;
    private javax.swing.JButton btn_dangnhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_gamil;
    private javax.swing.JPasswordField txt_matkhau;
    private javax.swing.JPasswordField txt_nhaplaipass;
    private javax.swing.JTextField txt_tennguoidung;
    // End of variables declaration//GEN-END:variables

    void setVisible(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
