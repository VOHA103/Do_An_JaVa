/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.sachDAO;
import POJO.Sach;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thuha
 */
public class Tim_Sach extends javax.swing.JFrame {

    DefaultTableModel modelTB;
    Vector tbTitle = new Vector();
    ArrayList<Sach> ds;

    /**
     * Creates new form Tim_Sach
     */
    public Tim_Sach() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbTitle.add("Mã Sách ");
        tbTitle.add("Tên Sách");
        tbTitle.add("Tác Giả");
        tbTitle.add("Năm XB");
        tbTitle.add("Loại");
        tbTitle.add("Số Trang ");
        tbTitle.add("Giá");
        tbTitle.add("Tình Trạng");

        modelTB = new DefaultTableModel();
        modelTB.setColumnIdentifiers(tbTitle);
        tb_dstimkiem.setModel(modelTB);
        loadDuLieu();
    }

    public void loadDuLieu() {
        ds = sachDAO.getDSSach();
        modelTB.setRowCount(0);
        for (Sach mt : ds) {
            Vector v = new Vector();
            v.add(mt.getMaSach());

            v.add(mt.getTenSach());
            v.add(mt.getTacGia());
            v.add(mt.getNamXuatBan());
            v.add(mt.getLoai());
            v.add(mt.getSoTrang());
            v.add(mt.getGia());
            v.add(mt.getTinhTrang());

            modelTB.addRow(v);
        }
    }

    boolean ktraRong(JTextField txt) {
        if (txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, txt.getName() + " không được rỗng", "Thông báo", 1);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lb_ketqua = new javax.swing.JLabel();
        rdo_tacgia = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        rdo_tensach = new javax.swing.JRadioButton();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_dstimkiem = new javax.swing.JTable();
        lb_ketquatim = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rdo_loaiSach = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TÌM SÁCH");

        lb_ketqua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_ketqua.setText("Tổng số dữ liệu tìm thấy:");

        buttonGroup1.add(rdo_tacgia);
        rdo_tacgia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdo_tacgia.setText("Tác Giả");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("ALL DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_tensach);
        rdo_tensach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdo_tensach.setText("Tên Sách");

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btn_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_timkiem.setText("Tìm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        tb_dstimkiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_dstimkiem);

        lb_ketquatim.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("TÌM KIẾM THÔNG TIN SÁCH ");

        buttonGroup1.add(rdo_loaiSach);
        rdo_loaiSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rdo_loaiSach.setText("Loại Sách");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lb_ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_ketquatim, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_timkiem)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rdo_tacgia)
                                .addGap(87, 87, 87)
                                .addComponent(rdo_tensach)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(rdo_loaiSach)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_tacgia)
                    .addComponent(rdo_tensach)
                    .addComponent(rdo_loaiSach))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_timkiem)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_ketquatim, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadDuLieu();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        if (ktraRong(txt_timkiem)) {
            return;
        }
        modelTB.setRowCount(0);
        if (this.rdo_tacgia.isSelected()) {

            ArrayList<Sach> dsm = sachDAO.timdTacGia(this.txt_timkiem.getText().trim());
            for (Sach hd : dsm) {
                Vector r = new Vector();
                r.add(hd.getMaSach());
                r.add(hd.getTenSach());
                r.add(hd.getTacGia());
                r.add(hd.getNamXuatBan());
                r.add(hd.getLoai());
                r.add(hd.getSoTrang());

                r.add(hd.getGia());
                r.add(hd.getTinhTrang());

                modelTB.addRow(r);

            }
            txt_timkiem.setText("");
            lb_ketquatim.setText("" + dsm.size());

        } else if (this.rdo_tensach.isSelected()) {

            ArrayList<Sach> dst = sachDAO.timtenSach(this.txt_timkiem.getText().trim());
            for (Sach hd : dst) {
                Vector r = new Vector();
              r.add(hd.getMaSach());
                r.add(hd.getTenSach());
                r.add(hd.getTacGia());
                r.add(hd.getNamXuatBan());
                r.add(hd.getLoai());
                r.add(hd.getSoTrang());

                r.add(hd.getGia());
                r.add(hd.getTinhTrang());

                modelTB.addRow(r);
            }
            txt_timkiem.setText("");
            lb_ketquatim.setText("" + dst.size());

        }
        else if (this.rdo_loaiSach.isSelected()) {

            ArrayList<Sach> dst = sachDAO.timdLoaiSach(this.txt_timkiem.getText().trim());
            for (Sach hd : dst) {
                Vector r = new Vector();
              r.add(hd.getMaSach());
                r.add(hd.getTenSach());
                r.add(hd.getTacGia());
                r.add(hd.getNamXuatBan());
                r.add(hd.getLoai());
                r.add(hd.getSoTrang());

                r.add(hd.getGia());
                r.add(hd.getTinhTrang());

                modelTB.addRow(r);
            }
            txt_timkiem.setText("");
            lb_ketquatim.setText("" + dst.size());

        }
        //        loadDuLieu();
    }//GEN-LAST:event_btn_timkiemActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Tim_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tim_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tim_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tim_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Tim_Sach().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_timkiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_ketqua;
    private javax.swing.JLabel lb_ketquatim;
    private javax.swing.JRadioButton rdo_loaiSach;
    private javax.swing.JRadioButton rdo_tacgia;
    private javax.swing.JRadioButton rdo_tensach;
    private javax.swing.JTable tb_dstimkiem;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
