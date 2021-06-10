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
public class Sach {
    String maSach ,tenSach ,tacGia ,loai ,tinhTrang ;
    int namXuatBan,soTrang ,gia;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, String loai, String tinhTrang, int namXuatBan, int soTrang, int gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.loai = loai;
        this.tinhTrang = tinhTrang;
        this.namXuatBan = namXuatBan;
        this.soTrang = soTrang;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", loai=" + loai + ", tinhTrang=" + tinhTrang + ", namXuatBan=" + namXuatBan + ", soTrang=" + soTrang + ", gia=" + gia + '}';
    }
    
}
