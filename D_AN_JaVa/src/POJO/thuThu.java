/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.sql.Date;

/**
 *
 * @author thuha
 */
public class thuThu {

    String maTT, tenTT, gioiTinh;
    Date ngaySinhTT;
    String diaChiTT, dienThoaiTT, email;

    public thuThu(String maTT, String tenTT, String gioiTinh, Date ngaySinhTT, String diaChiTT, String dienThoaiTT, String email) {
        this.maTT = maTT;
        this.tenTT = tenTT;
        this.gioiTinh = gioiTinh;
        this.ngaySinhTT = ngaySinhTT;
        this.diaChiTT = diaChiTT;
        this.dienThoaiTT = dienThoaiTT;
        this.email = email;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public String getTenTT() {
        return tenTT;
    }

    public void setTenTT(String tenTT) {
        this.tenTT = tenTT;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinhTT() {
        return ngaySinhTT;
    }

    public void setNgaySinhTT(Date ngaySinhTT) {
        this.ngaySinhTT = ngaySinhTT;
    }

    public String getDiaChiTT() {
        return diaChiTT;
    }

    public void setDiaChiTT(String diaChiTT) {
        this.diaChiTT = diaChiTT;
    }

    public String getDienThoaiTT() {
        return dienThoaiTT;
    }

    public void setDienThoaiTT(String dienThoaiTT) {
        this.dienThoaiTT = dienThoaiTT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public thuThu() {
    }

    @Override
    public String toString() {
        return "thuThu{" + "maTT=" + maTT + ", tenTT=" + tenTT + ", gioiTinh=" + gioiTinh + ", ngaySinhTT=" + ngaySinhTT + ", diaChiTT=" + diaChiTT + ", dienThoaiTT=" + dienThoaiTT + ", email=" + email + '}';
    }

    
}
