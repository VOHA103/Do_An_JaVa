/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author thuha
 */
public class Account {
    String tenDangNhap ,gmail ,matKhau ;

    public Account() {
    }

    public Account(String tenDangNhap, String gmail, String matKhau) {
        this.tenDangNhap = tenDangNhap;
        this.gmail = gmail;
        this.matKhau = matKhau;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "Account{" + "tenDangNhap=" + tenDangNhap + ", gmail=" + gmail + ", matKhau=" + matKhau + '}';
    }

    
}
