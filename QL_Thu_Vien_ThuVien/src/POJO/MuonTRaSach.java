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
public class MuonTRaSach {
    String maMuonTRa ,maSinhVien ,maSach ,hinhThucMuon ,quanLyThuVien ;
 int soLuongMuon ;
    Date ngayMuon ,ngayTRa ;

   
    public String getMaMuonTRa() {
        return maMuonTRa;
    }

    public void setMaMuonTRa(String maMuonTRa) {
        this.maMuonTRa = maMuonTRa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getHinhThucMuon() {
        return hinhThucMuon;
    }

    public void setHinhThucMuon(String hinhThucMuon) {
        this.hinhThucMuon = hinhThucMuon;
    }

    public String getQuanLyThuVien() {
        return quanLyThuVien;
    }

    public void setQuanLyThuVien(String quanLyThuVien) {
        this.quanLyThuVien = quanLyThuVien;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTRa() {
        return ngayTRa;
    }

    public void setNgayTRa(Date ngayTRa) {
        this.ngayTRa = ngayTRa;
    }

    public MuonTRaSach(String maMuonTRa, String maSinhVien, String maSach, String hinhThucMuon, String quanLyThuVien, int soLuongMuon, Date ngayMuon, Date ngayTRa) {
        this.maMuonTRa = maMuonTRa;
        this.maSinhVien = maSinhVien;
        this.maSach = maSach;
        this.hinhThucMuon = hinhThucMuon;
        this.quanLyThuVien = quanLyThuVien;
        this.soLuongMuon = soLuongMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTRa = ngayTRa;
    }

    public MuonTRaSach() {
    }

    @Override
    public String toString() {
        return "MuonTRaSach{" + "maMuonTRa=" + maMuonTRa + ", maSinhVien=" + maSinhVien + ", maSach=" + maSach + ", hinhThucMuon=" + hinhThucMuon + ", quanLyThuVien=" + quanLyThuVien + ", soLuongMuon=" + soLuongMuon + ", ngayMuon=" + ngayMuon + ", ngayTRa=" + ngayTRa + '}';
    }
   
    
}
